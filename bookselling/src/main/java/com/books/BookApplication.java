package com.books;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
public class BookApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(BookApplication.class, args);
    }
}
