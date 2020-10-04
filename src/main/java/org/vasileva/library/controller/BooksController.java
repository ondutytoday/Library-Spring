package org.vasileva.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.vasileva.library.service.BooksService;


@Controller
@RequestMapping(value = "/books/")
public class BooksController {

    private BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public String showAllBooks (Model model) {
        model.addAttribute("books", booksService.getAll());
        return "index";
    }

    @GetMapping (value = "{id}")
    public String showBook (@PathVariable (value = "id") Long id, Model model) {
        model.addAttribute("book", booksService.getById(id));
        return "show";
    }

/*    @PostMapping (value = "")
    public String saveBook (@RequestBody Books book) {
        return "save_book";
    }

    @PutMapping (value = ":id")
    public String updateBook (@RequestBody Books bookDetails, @PathVariable (value = "id") Long id) {
        return "put_book";
    }

    @DeleteMapping (value = ":id")
    public String deleteBook (@PathVariable (value = "id") Long id) {
        return "delete_book";
    }


    @GetMapping (value = "new")
    public String newform () {
        return "";
    }

    @GetMapping (value = ":id/edit")
    public String editform () {
        return "";
    }*/

}
