package com.springbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLifecycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        LifecycleBean bean1 = context.getBean(LifecycleBean.class);

        // Perform operations with the bean
        bean1.performOperation();

        // Destroy the application context
        context.close();
    }
}