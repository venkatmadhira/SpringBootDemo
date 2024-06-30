package com.example.springlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springlifecycle")
public class AppConfig {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public CustomBean customBean() {
        return new CustomBean();
    }

    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}
