package com.aop;

import org.springframework.stereotype.Service;

// A simple business service class
@Service
public class BusinessService {

    public void performTask() {
        System.out.println("BusinessService: Performing a task...");
    }

    public void anotherTask() {
        System.out.println("BusinessService: Performing another task...");
    }
}