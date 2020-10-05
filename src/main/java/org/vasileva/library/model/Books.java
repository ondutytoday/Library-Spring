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

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publishing_year", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "YYYY")
    private Date publishingYear;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "page_count", nullable = false)
    private Integer pageCount;

    public Books() {
    }

    public Books(String title, String author, Date publishingYear, String genre, Integer pageCount) {
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

    public Date getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Date publishingYear) {
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

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publishingYear=" + publishingYear +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        return bookId.equals(books.bookId);
    }

    @Override
    public int hashCode() {
        return bookId.hashCode();
    }
}
