package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    private final List<String> books = Arrays.asList(
            "Harry Potter", "Lord of the Rings", "Wings of Fire");

    public List<String> findAll() {
        return books;
    }
}
