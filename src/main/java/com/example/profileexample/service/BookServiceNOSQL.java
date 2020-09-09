package com.example.profileexample.service;

import com.example.profileexample.model.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("NOSQL")
@Service
public class BookServiceNOSQL implements BookService {

    @Value("${message.default.properties}")
    private String messageDefault;

    @Value("${message.default.toOverride}")
    private String messageOverridden;

    @Value("${message.nosql.properties}")
    private String messageNOSQL;

    @Override
    public Book getBook(int id) {

        System.out.println(messageDefault);
        System.out.println(messageOverridden);
        System.out.println(messageNOSQL);
        return new Book(1, "Book-NOSQL");

    }

}
