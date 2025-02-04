package com.rossie.graphql;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class BookController {
    private final BookRepository bookRepository;


    @QueryMapping
    public Iterable<Book> books() {
        return bookRepository.findAll();
    }

}
