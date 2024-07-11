package com.pl.wwsis.sss.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_number")
    private String studentNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "email")
    private String email;

    // Getters and Setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
