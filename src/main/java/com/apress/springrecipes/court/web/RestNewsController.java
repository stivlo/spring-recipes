package com.apress.springrecipes.court.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestNewsController {
    
    @Autowired
    protected RestTemplate restTemplate;
    
    @RequestMapping("/sportsnews")
    public String getYahooNews(Model model) {
        String url = "http://search.yahooapis.com/NewsSearchService/V1/newsSearch?appid={appid}" +
        		"&query={query}&results={results}&language={language}";
        //Return view newstemplate. Via resolver the view will be mapped to /WEB-INF/jsp/newstemplate.jsp
        String result = restTemplate.getForObject(url, String.class, "YahooDemo", "sports", "2", "en");
        model.addAttribute("newsfeed", result);
        return "newstemplate";
    }
    
}
