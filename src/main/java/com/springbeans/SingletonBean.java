package com.springbeans;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SpringSingletonBean instance created");
    }
}
