package com.example.profileexample.service;

import com.example.profileexample.model.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SQL")
@Service
public class BookServiceSQL implements BookService {

    @Value("${message.default.properties}")
    private String message;

    @Override
    public Book getBook(int id) {

        System.out.println(message);
        return new Book(1, "Book-SQL");

    }

}
