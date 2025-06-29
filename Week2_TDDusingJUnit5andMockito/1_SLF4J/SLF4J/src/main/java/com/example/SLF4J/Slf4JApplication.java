package com.example.SLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4JApplication {

    private static final Logger logger = LoggerFactory.getLogger(Slf4JApplication.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.info("This is an info message");
        logger.debug("This is a debug message (won't appear with default config)");
    }
}
