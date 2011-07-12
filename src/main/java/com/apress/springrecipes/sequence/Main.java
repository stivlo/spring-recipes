package com.apress.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Provide one argument with the xml file name to load");
            return;
        }
        String config = "com/apress/springrecipes/sequence/" + args[0];
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }

}
