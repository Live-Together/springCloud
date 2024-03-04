package com.example.alibaba202202consumer8080.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DepartConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
