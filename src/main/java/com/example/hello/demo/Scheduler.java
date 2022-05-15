package com.example.hello.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Async("workExecutor")
    @Scheduled(fixedDelayString = "PT10M")
    public void reportCurrentData() throws InterruptedException {
        System.out.println("Hello world");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}

