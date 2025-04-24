package com.springbeans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifecycleBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized");
    }

    public void performOperation() {
        System.out.println("Performing operation");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroyed");
    }
}