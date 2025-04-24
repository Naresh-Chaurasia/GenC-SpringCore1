package com.injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionExample {

    @Autowired
    private MessageService messageService; // Field Injection

    public void printMessage() {
        System.out.println("Field Injection: " + messageService.getMessage());
    }
}
