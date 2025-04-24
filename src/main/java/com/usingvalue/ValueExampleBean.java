package com.usingvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExampleBean {

    @Value("Hello, Spring!") // Inject a hardcoded value
    private String hardcodedMessage;

    @Value("${app.name}") // Inject a value from the properties file
    private String appName;

    @Value("${app.version:1.0.0}") // Inject a value with a default fallback
    private String appVersion;

    public void printValues() {
        System.out.println("Hardcoded Message: " + hardcodedMessage);
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
    }
}