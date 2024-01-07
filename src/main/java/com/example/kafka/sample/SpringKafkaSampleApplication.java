package com.example.kafka.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringKafkaSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaSampleApplication.class, args);
    }

}
