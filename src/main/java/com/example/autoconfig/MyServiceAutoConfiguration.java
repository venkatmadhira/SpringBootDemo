package com.example.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServiceAutoConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
