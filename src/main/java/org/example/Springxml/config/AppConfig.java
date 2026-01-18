package org.example.Springxml.config;


import org.example.Springxml.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "comp2")
    Desktop desktop(){
        return new Desktop();
    }
}
