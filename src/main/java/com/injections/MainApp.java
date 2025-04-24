package com.injections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Constructor Injection Example
        ConstructorInjectionExample constructorInjection = context.getBean(ConstructorInjectionExample.class);
        constructorInjection.printMessage();

        // Setter Injection Example
        SetterInjectionExample setterInjection = context.getBean(SetterInjectionExample.class);
        setterInjection.printMessage();

        // Field Injection Example
        FieldInjectionExample fieldInjection = context.getBean(FieldInjectionExample.class);
        fieldInjection.printMessage();
    }
}