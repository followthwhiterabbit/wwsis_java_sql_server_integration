package com.pl.wwsis.sss.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "library_item")
public class LibraryItem {
    @Id
    @Column(name = "item_code")
    private String itemCode;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "type")
    private String type;

    // Getters and Setters
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
