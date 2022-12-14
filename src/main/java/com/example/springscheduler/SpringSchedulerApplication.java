package com.example.springscheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;


@SpringBootApplication
public class SpringSchedulerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringSchedulerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerApplication.class, args);
    }

    //@Scheduled(fixedRate = 2000L)
    //@Scheduled(initialDelay = 1000L ,fixedDelay = 2000L)
    @Scheduled(cron="*/5    *    *    *    *    *")
    void someJob(){
        LOGGER.info("Current time is "+ LocalTime.now());
    }

    @Scheduled(cron="*/5    *    *    *    *    *")
    void someJob2(){
        LOGGER.info("What is this "+ LocalTime.now());
    }
}
