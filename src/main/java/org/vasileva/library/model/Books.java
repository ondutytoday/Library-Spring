package org.vasileva.library.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "publishing_year", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "YYYY")
    private Date publishingYear;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "page_count", nullable = false)
    private Integer pageCount;

}
