package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Main application class
public class MainApp {
    public static void main(String[] args) {
        // Initialize Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the BusinessService bean
        BusinessService businessService = context.getBean(BusinessService.class);

        // Call methods on the business service
        businessService.performTask();
        businessService.anotherTask();
    }
}