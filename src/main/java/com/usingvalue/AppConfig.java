package com.usingvalue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.usingvalue") // Scan for components in the specified package
@PropertySource("classpath:application.properties") // Load properties file
public class AppConfig {
}