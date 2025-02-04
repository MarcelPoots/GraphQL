package com.rossie.graphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    ApplicationRunner applicationRunner(BookRepository bookRepository) {
        return args -> bookRepository.saveAll(List.of(
                new Book("LOTR", "Tolkien"),
                new Book("The Blood prince", "JK Rowlins"),
                new Book("The Old man and the sea", "Hemingway")
        ));
    }
}
