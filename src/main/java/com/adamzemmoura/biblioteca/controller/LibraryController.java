package com.adamzemmoura.biblioteca.controller;

import com.adamzemmoura.biblioteca.data.BookRepository;
import com.adamzemmoura.biblioteca.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class LibraryController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        List<Book> allBooks = bookRepository.getAllBooks();
        modelMap.put("books", allBooks);
        return "index";
    }

}
