package com.pl.wwsis.sss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Table(name = "borrowing")
public class Borrowing {
    @Id
    @ManyToOne
    @JoinColumn(name = "item_code")
    private LibraryItem libraryItem;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_number")
    private Student student;

    @Column(name = "issue_date")
    private Date issueDate;


    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "fine")
    private Double fine;

    // Getters and Setters
    public LibraryItem getLibraryItem() {
        return libraryItem;
    }

    public void setLibraryItem(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }
}
