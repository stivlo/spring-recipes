package com.apress.springrecipes.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member/*")
public class MemberController {

    /**
     * This method will be called by /member/add
     * 
     * @param model
     * @return the view to display
     */
    @RequestMapping("add")
    public String addMember(Model model) {
        model.addAttribute("member", "Testing");
        model.addAttribute("guests", "Will be a list");
        return "memberlist";
    }

    /**
     * This method will be called by either /member/remove and /member/delete
     */
    @RequestMapping(value = { "remove", "delete" }, method = RequestMethod.GET)
    public String removeMember(@RequestParam("memberName") String memberName) {
        //memberService.remove(memberName);
        return "redirect:";
    }

    /**
     * This method will be called with member/display/jdoe, for instance
     * 
     * @param memberName
     *            member name as traditional url parameter
     * @param user
     *            member name in template notation
     * @param model
     * @return the JSP view to display
     */
    @RequestMapping("display/{user}")
    public String displayMember(@PathVariable("user") String user, Model model) {
        model.addAttribute("user", user);
        return "displayMember";
    }

}
