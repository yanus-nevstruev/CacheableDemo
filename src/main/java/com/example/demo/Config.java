package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    TestCacheable testCacheable(){
        return new TestCacheable();
    }

}
