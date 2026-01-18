package org.example.Springxml.config;


import org.example.Springxml.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name = "comp2")
    @Bean
    //by making scope prtotype the object will creted that many time as many time i have creted contex
    @Scope("prototype")
    Desktop desktop(){
        return new Desktop();
    }
}
