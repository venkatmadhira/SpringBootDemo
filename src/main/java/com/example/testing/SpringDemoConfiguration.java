package com.example.testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.testing")
public class SpringDemoConfiguration {
    @Bean
    public String config(){
        return "From @Configuration Bean";
    }
}
