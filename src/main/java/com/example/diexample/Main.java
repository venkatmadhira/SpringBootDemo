package com.example.diexample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        String modelCar=car.setModel("Ferrari");
        String value=car.start();
        System.out.println(value);
        System.out.println(modelCar);
    }
}

