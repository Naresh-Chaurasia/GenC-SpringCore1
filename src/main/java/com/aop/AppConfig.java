package com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Spring configuration class
@Configuration
@ComponentScan(basePackages = "com.aop") // Scans the package for components
@EnableAspectJAutoProxy // Enables Spring AOP proxy support
public class AppConfig {
}
