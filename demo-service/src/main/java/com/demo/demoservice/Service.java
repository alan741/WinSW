package com.demo.demoservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Service.class);
    
    @Scheduled(fixedRate = 10000)
    public void SayHello() {
        logger.info("Hello World!");
    }
}
