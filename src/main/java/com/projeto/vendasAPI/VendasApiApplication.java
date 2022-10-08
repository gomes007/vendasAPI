package com.projeto.vendasAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApiApplication {

//    @GetMapping("/hello")
//    public String hello(){
//        return "Hello";
//    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApiApplication.class, args);
    }

}
