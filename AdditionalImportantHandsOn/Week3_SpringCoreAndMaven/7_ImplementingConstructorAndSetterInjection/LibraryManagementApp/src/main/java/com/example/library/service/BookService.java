package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.serviceName = "DefaultServiceName"; 
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void displayBook(){
        System.out.println("Constructor Injection");
        System.out.println("Service: " + serviceName);
        System.out.println("Setter Injection");
        System.out.println("Fetching books from repository:");
        bookRepository.getBooks();
    }
}