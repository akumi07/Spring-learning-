package org.example.Springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       //application context is superset of bean factory ye hi object load krwata hai container jisses ioc and Di hopata hai.
        //ye spring container bnata hai overall
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        //line 11 me jo likha hai usme spring .xml me context dete hi jo jo class ke beans declare honge spring .xml me unke unke object bn jate hai (Agr chk krna hai to line 14 ko comment krdo get bean wala tobhi dekhna constructor call hojata hai.)
        //ye jo bracket me niche alien likhe hai application context yhi naam khojega spring.xml me
        Alien obj1= (Alien) context.getBean("alien1");
        obj1.compile();
        obj1.age=21;


        Alien obj2= (Alien) context.getBean("alien1");
        obj2.compile();
        System.out.println(obj2.age);
        System.out.println("Hello, World!");

        //upar same bean ki id hai to object jitni baar yha diffrent name se bnale refer to usi id k object ko kr rha hai isliye age obj2 me set kiye bina obj1 wli print hogyi
    }
}