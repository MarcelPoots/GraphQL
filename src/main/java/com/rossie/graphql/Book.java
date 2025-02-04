package com.rossie.graphql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {

    }
}
