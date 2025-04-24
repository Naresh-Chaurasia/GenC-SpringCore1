package com.mapinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the MapInjectionExample bean
        MapInjectionExample mapInjectionExample = context.getBean(MapInjectionExample.class);

        // Print the injected map
        mapInjectionExample.printMap();
    }
}