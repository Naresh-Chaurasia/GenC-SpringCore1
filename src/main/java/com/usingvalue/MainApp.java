package com.usingvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ValueExampleBean valueExampleBean = context.getBean(ValueExampleBean.class);

        // Print the injected values
        valueExampleBean.printValues();
    }
}