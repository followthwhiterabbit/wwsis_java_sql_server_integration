package com.pl.wwsis.sss.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "specialization")
public class Specialization {
    @Id
    @Column(name = "spec_code")
    private String specCode;

    @Column(name = "spec_name")
    private String specName;

    @Column(name = "spec_description")
    private String specDescription;

    // Getters and Setters
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getSpecDescription() {
        return specDescription;
    }

    public void setSpecDescription(String specDescription) {
        this.specDescription = specDescription;
    }
}
