package com.example.testing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringDemoConfiguration.class);
       SpringHelloService service= ctx.getBean("springHelloService",SpringHelloService.class);
       String serviceName=service.sayHi();
        System.out.println(serviceName);
    }
}
