package com.example.testing;

import org.springframework.stereotype.Service;

@Service(value="springHelloService")
public class SpringHelloService {
    public String sayHi(){
        return "From @Service Bean";
    }
}
