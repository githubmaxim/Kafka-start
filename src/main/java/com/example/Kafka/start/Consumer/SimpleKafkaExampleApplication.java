package com.example.Kafka.start.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

// 11111111111111111111111111111111111111111111111111111111

//@EnableKafka
@SpringBootApplication
public class SimpleKafkaExampleApplication {
    @KafkaListener(topics="msg")
    public void msgListener(String msg){
        System.out.println(msg);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(SimpleKafkaExampleApplication.class, args);
//    }
}
