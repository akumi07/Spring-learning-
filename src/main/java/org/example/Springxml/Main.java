package org.example.Springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       //application context is superset of bean factory ye hi object load krwata hai container jisses ioc and Di hopata hai.
        //ye spring container bnata hai overall
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        //ye jo bracket me niche alien like hai application context yhi naam khojega spring.xml me
        Alien obj= (Alien) context.getBean("alien");
        obj.compile();
        System.out.println("Hello, World!");
    }
}