package com.example.hello.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Async
    @Scheduled(fixedDelayString = "PT30M")
    public void reportCurrentData() throws InterruptedException {
        System.out.println("Hello world");
        Thread.sleep(3000);
    }
}
