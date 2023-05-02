package com.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8080")
public class BookApplication {
    public static void main(String[] args) {
        System.out.println("开启网络二手书交易平台");
        SpringApplication.run(BookApplication.class, args);
    }
}
