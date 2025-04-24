package com.springbeans;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Define the bean as a prototype
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean instance created");
    }

    public void doSomething() {
        System.out.println("Doing something in PrototypeBean");
    }
}