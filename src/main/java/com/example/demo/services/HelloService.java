package com.example.demo.services;
import org.springframework.stereotype.Service;
import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

@Service
public class HelloService {

    @Async
    public Future<String> asyncFunc1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<>("Hello");
    }
    
    @Async
    public Future<String> asyncFunc2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<>("Csaba");
    }
    
    
}