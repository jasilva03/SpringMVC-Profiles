package com.example.profileexample.controller;

import com.example.profileexample.model.Book;
import com.example.profileexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Book> getById() {

        return new ResponseEntity<>(bookService.getBook(1), HttpStatus.OK);

    }

}
