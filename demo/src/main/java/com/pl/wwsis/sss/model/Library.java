package com.pl.wwsis.sss.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "library")
public class Library {
    @Id
    @Column(name = "library_code")
    private String libraryCode;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "hours")
    private String hours;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "website")
    private String website;

    // Getters and Setters
    public String getLibraryCode() {
        return libraryCode;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
