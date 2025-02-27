package com.First.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
@Primary // to avoid confusion we can use this annotation, so that the spring boot considers this class while executing.
public class Desktop implements Computer {

    @Override
    public void compile()
    {
        System.out.println("Compiling with 404 bugs but faster");
    }

}
