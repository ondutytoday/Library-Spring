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

/*    @PostMapping()
    public String createBook (@ModelAttribute("book") Books book) {
        booksService.save(book);
        return "redirect:index";
    }*/




        /*(@RequestParam("title") String title,
                              @RequestParam("author") String author,
                              @RequestParam("publishing year") String publishingYear,
                              @RequestParam("genre") String genre,
                              @RequestParam("page count") String pageCount,
                              Model model) throws ParseException {
        Date date=new SimpleDateFormat("YYYY").parse(publishingYear);
        Books book = new Books(author, title, date, genre, Integer.parseInt(pageCount));
        booksService.save(book);
        model.addAttribute("book", book);
        return "successPage";
    }*/

/*    @PutMapping (value = ":id")
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
