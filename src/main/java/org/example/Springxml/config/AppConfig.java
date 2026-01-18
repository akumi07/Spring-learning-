package org.example.Springxml.config;


import org.example.Springxml.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Desktop desktop(){
        return new Desktop();
    }
}
