package org.vasileva.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.vasileva.library.model.Books;
import org.vasileva.library.service.BooksService;

@Controller
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping (value = "/{id}")
    public String getBook (@PathVariable (value = "id") Long id) {
        return "get_book";
    }

    @PostMapping (value = "")
    public String saveBook (@RequestBody Books book) {
        return "save_book";
    }

    @PutMapping (value = "/{id}")
    public String updateBook (@RequestBody Books bookDetails, @PathVariable (value = "id") Long id) {
        return "put_book";
    }

    @DeleteMapping (value = "/{id}")
    public String deleteBook (@PathVariable (value = "id") Long id) {
        return "delete_book";
    }
    @GetMapping (value = "")
    public String getAllBooks (@PathVariable (value = "id") Long id) {
        return "get_all_books";
    }
}
