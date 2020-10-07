package org.vasileva.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.vasileva.library.model.Books;
import org.vasileva.library.service.BooksService;


@Controller
@RequestMapping(value = "books")
public class BooksController {

    private BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping()
    public String showAllBooks (Model model) {
        model.addAttribute("books", booksService.getAll());
        return "index";
    }

    @GetMapping ("/{id}")
    @Transactional
    public String showBook (@PathVariable (value = "id") Long id, Model model) {
        model.addAttribute("book", booksService.getById(id));
        return "show";
    }

    @GetMapping ("/new")
    public String newBook (Model model) {
        model.addAttribute("book", new Books());
        return "new";
    }

    @PostMapping()
    public String createBook (@ModelAttribute("book") Books book) {
        booksService.save(book);
        return "redirect:books";
    }

    @DeleteMapping (value = "/remove/{id}")
    public String deleteBook (@PathVariable (value = "id") Long id) {
        booksService.delete(id);
        return "redirect:books";
    }

    @PutMapping (value = "/edit/{id}")
    public String editBook (@PathVariable (value = "id") Long id, Model model) {
        model.addAttribute("book", booksService.getById(id));
        return "show";
    }

}
