package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = ctx.getBean("bookService", BookService.class);
        System.out.println("Books in the Library: " + service.listBooks());
    }
}
