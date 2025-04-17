package com.autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageApp {
    public static void main(String[] args) {
        // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the GreetingService bean
        MessageService message = context.getBean("greetingService", MessageService.class);

        // Call the method
        message.sendMessage();
    }
}