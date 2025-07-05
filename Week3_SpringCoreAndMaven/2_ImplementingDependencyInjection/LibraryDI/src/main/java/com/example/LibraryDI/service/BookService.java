package com.example.LibraryDI.service;

import com.example.LibraryDI.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepo = bookRepository;
    }

    public void displayBooks() {
        bookRepo.findAllBooks();
    }
}
