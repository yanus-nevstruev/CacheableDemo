package com.example.demo;


import org.springframework.cache.annotation.Cacheable;


public class TestCacheable {

    @Cacheable("users")
    public String getFromDb() {
        System.out.println("get from db");
        System.out.println("getting info from database...");
        return "123";
    }

    public void call() {
        System.out.println("call");
        getFromDb();
    }
}




