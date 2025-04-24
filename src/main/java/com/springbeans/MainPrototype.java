package com.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPrototype {
    public static void main(String[] args) {

        // Create an SLF4J Logger instance
        final Logger logger = LoggerFactory.getLogger(MainPrototype.class);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PrototypeBean bean1 = context.getBean(PrototypeBean.class);
        PrototypeBean bean2 = context.getBean(PrototypeBean.class);

        System.out.println("Are both beans the same instance? " + (bean1 == bean2));
        System.out.println(bean1);
        System.out.println(bean2);

        // Log whether the beans are the same instance
        logger.info("Are both beans the same instance? {}", (bean1 == bean2));
        logger.debug("Bean 1: {}", bean1);
        logger.debug("Bean 2: {}", bean2);

    }
}