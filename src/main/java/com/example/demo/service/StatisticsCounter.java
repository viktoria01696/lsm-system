package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StatisticsCounter {

    private static final Logger log = LoggerFactory.getLogger(StatisticsCounter.class);

    public void countHandlerCall() {
        log.info("Кто-то дернул нашу ручку!");
    }
}
