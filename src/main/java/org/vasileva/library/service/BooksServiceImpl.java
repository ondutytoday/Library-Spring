package org.vasileva.library.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vasileva.library.model.Books;
import org.vasileva.library.repository.BooksRepository;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService{
    Logger logger = LoggerFactory.getLogger(BooksServiceImpl.class);

    @Autowired
    BooksRepository booksRepository;

    @Override
    public Books getById(Long id) {
        logger.info("IN BooksServiceImpl getById {}", id);
        return booksRepository.getOne(id);
    }

    @Override
    public void save(Books book) {
        logger.info("IN BooksServiceImpl save {}", book);
        booksRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        logger.info("IN BooksServiceImpl delete {}", id);
        booksRepository.deleteById(id);
    }

    @Override
    public List<Books> getAll() {
        logger.info("IN BooksServiceImpl getAll");
        return booksRepository.findAll();
    }
}
