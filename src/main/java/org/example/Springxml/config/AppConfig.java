package org.example.Springxml.config;


import org.example.Springxml.Alien;
import org.example.Springxml.Computer;
import org.example.Springxml.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example.Springxml")
public class AppConfig {
//    @Bean
            //autowiring done
//    Alien alien(Computer com1){
//        Alien obj=new Alien( );
//        obj.setAge(25);
//        obj.setComputer(com1);
//        return obj;
//    }
//    @Bean(name = "comp2")
//    @Bean
    //by making scope prototype the object will created that many time as many time i have created contex
//    @Scope("prototype")
//    Desktop desktop(){
//        return new Desktop();
//    }
}
