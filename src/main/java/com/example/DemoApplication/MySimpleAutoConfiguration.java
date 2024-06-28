package com.example.DemoApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AdsConditionalOnProperty
public class MySimpleAutoConfiguration {
    @Bean
    public MySimpleService mySimpleService() {
        return new MySimpleService();
    }
}
