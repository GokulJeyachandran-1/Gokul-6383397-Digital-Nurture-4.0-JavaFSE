package com.example.LibraryDI.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.LibraryDI.service.BookService;

public class LibraryManagementApp {
    public static void main(String[] args) {
        
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            // Retrieve the BookService bean
            BookService bookService = (BookService) context.getBean("bookService");

            // Use the BookService to display books
            bookService.displayBooks();

            ((org.springframework.context.ConfigurableApplicationContext) context).close(); 
    }
}