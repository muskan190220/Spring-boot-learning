package com.First.myApp;

import org.springframework.stereotype.Component;

@Component 
public class Laptop implements Computer {

    @Override
    public void compile()
    {
        System.out.println("Compiling with 404 bugs");
    }

}
