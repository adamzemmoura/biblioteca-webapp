package com.adamzemmoura.biblioteca.data;

import com.adamzemmoura.biblioteca.model.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {

    private final List<Book> ALL_BOOKS = Arrays.asList(
            new Book("Clean Code", "Robert C. Martin", "1999"),
            new Book("Clean Coder", "Robert C. Martin", "1999"),
            new Book("Refactoring", "Martin Fowler", "1999")
    );

    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }
}
