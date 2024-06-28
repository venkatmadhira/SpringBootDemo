package com.example.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

@Configuration
@ConditionalOnBean(MyService.class)
public class MyServiceAutoConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
