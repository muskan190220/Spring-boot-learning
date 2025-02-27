package com.First.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Used for telling the Spring boot to work on this class
public class Dev {

    //There are 3 types of Dependency Injection : Field, Constructor and Setter: 

    // This is Field injection:
    @Autowired //For connecting 2 classes, we can also use ApplicationContext.
    @Qualifier("desktop")//It is used same as primary annotation
    private Computer comp; 
    /*This is Constructor injection:
    public Dev(Laptop laptop)
    {
        this.laptop = laptop;
    }
    */

    /*This is Setter injection:
    @Autowired
    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
    }
    */

    public void build() 
    {
        comp.compile();
        System.out.println("Working on Awesome Project");
    }
}
