package com.injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionExample {

    private final MessageService messageService;

    // Constructor Injection
    @Autowired
    public ConstructorInjectionExample(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println("Constructor Injection: " + messageService.getMessage());
    }
}