package com.example.profileexample.service;

import com.example.profileexample.model.Book;
import org.springframework.http.ResponseEntity;

public interface BookService {

    Book getBook(int id);

}
