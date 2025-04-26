package com.slf4jexamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("This is an INFO message");
        logger.debug("This is a DEBUG message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");

        int value = 42;
        logger.info("Logging a variable: value = {}", value);
    }
}