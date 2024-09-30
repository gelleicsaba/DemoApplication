package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.Future;

@RestController
public class HelloWorldController {
    
    @Autowired
    private HelloService _helloService;

    @RequestMapping("/")
    public String home() {
        return "Spring boot example application";
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
    @RequestMapping("/mycar")
    public Car mycar() {
        return new Car("sedan","BMW 500",2023);
    } 

    @RequestMapping("/cars/for/sale")
    public List<Car> carsForSale() {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("sedan","VW Gold",2021));
        list.add(new Car("SUV","Ford suv",2022));
        return list;
    }
    
    @RequestMapping("/async/hello")
    public String helloAsync() {
        try {
            final Future<String> sf1 = _helloService.asyncFunc1();
            final Future<String> sf2 = _helloService.asyncFunc2();
            while (!sf1.isDone() && !sf2.isDone()) {
                Thread.sleep(10);
            }
            final String message = sf1.get() + " " + sf2.get();
            return message;
        } catch (Exception ex) {
            return "";
        }
    }    
    
}
