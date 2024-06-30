package com.example.springlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLifecycleApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomBean customBean = context.getBean(CustomBean.class);
        context.close();
        System.out.println(customBean);
    }
}
