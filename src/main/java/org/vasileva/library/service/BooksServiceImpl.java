package org.vasileva.library.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vasileva.library.model.Books;
import org.vasileva.library.repository.BooksRepository;

import java.util.List;

@Service
@Transactional
public class BooksServiceImpl implements BooksService{

    @Autowired
    BooksRepository booksRepository;

    @Override
    public Books getById(Long id) {
        return booksRepository.getOne(id);
    }

    @Override
    public void save(Books book) {
        booksRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        booksRepository.deleteById(id);
    }

    @Override
    public List<Books> getAll() {
        return (List<Books>) booksRepository.findAll();
    }
}
