package com.dmvinformatica.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicationInit {

    public static void main(String[] args) {

        SpringApplication.run(AplicationInit.class, args);
        System.out.println("Executando...");
    }

}
