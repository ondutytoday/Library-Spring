package org.vasileva.library.model;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Proxy(lazy = false)
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publishing_year", nullable = false)
    private Integer publishingYear;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "page_count", nullable = false)
    private Integer pageCount;

    public Books() {
    }

    public Books(String title, String author, Integer publishingYear, String genre, Integer pageCount) {
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

}
