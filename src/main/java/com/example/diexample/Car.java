package com.example.diexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    private String model;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }
    public String setModel(String model) {
        this.model = model;
        return model+"  ------  "+"From Setter Method";
    }
    public String start() {
        engine.run();
        return "From Car ";
    }
}

