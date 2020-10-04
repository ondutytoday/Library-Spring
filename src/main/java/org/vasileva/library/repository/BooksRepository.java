package org.vasileva.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vasileva.library.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
}
