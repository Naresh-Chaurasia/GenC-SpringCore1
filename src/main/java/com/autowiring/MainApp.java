package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the GreetingService bean
        GreetingService greetingService = context.getBean(GreetingService.class);

        // Call the method
        greetingService.sayHello();
    }
}