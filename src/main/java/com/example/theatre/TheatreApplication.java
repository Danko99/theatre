package com.example.theatre;

import com.example.theatre.model.Spectacle;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableKafka
@EnableSwagger2
@SpringBootApplication(exclude = { R2dbcAutoConfiguration.class })
public class TheatreApplication {

    @KafkaListener(topics="msg")
    public void msgListener(ConsumerRecord<String, Spectacle> record){
//        System.out.println(msg);
        System.out.println(record.value());
    }

    public static void main(String[] args) {
        SpringApplication.run(TheatreApplication.class, args);
    }
}
