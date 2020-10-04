package org.vasileva.library.service;

import org.vasileva.library.model.Books;

import java.util.List;

public interface BooksService {

    Books getById (Long id);

    void save (Books book);

    void delete (Long id);

    List<Books> getAll();
}
