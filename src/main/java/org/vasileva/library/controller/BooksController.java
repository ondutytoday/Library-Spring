package org.vasileva.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.vasileva.library.model.Books;
import org.vasileva.library.service.BooksService;

import java.util.List;


@Controller
public class BooksController {

    private BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/books")
    public String showAllBooks (Model model) {
        List<Books> list = booksService.getAll();
        model.addAttribute("books", list);
        return "book-list";
    }

    @GetMapping("/book-create")
    public String createBookForm(Model model){
        Books book = new Books();
        model.addAttribute("book", book);
        return "book-create";
    }

    @PostMapping("/book-create")
    public String createUser(@ModelAttribute("book") Books book){
        booksService.save(book);
        return "redirect:/books";
    }

    @GetMapping("book-delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        booksService.delete(id);
        return "redirect:/books";
    }

    @GetMapping("/book-update/{id}")
    public String updateBookForm(@PathVariable("id") Long id, Model model){
        Books book = booksService.getById(id);
        model.addAttribute("book", book);
        return "book-update";
    }

    @PostMapping("/book-update")
    public String updateBook(Books book){
        booksService.save(book);
        return "redirect:/books";
    }

}
