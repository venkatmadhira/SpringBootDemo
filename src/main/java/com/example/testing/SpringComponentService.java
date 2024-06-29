package com.example.testing;

import org.springframework.stereotype.Component;

@Component
public class SpringComponentService {
    public String sayHello(){
        return "From @Component Bean";

    }
}
