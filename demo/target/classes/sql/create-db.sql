
CREATE DATABASE IF NOT EXISTS Student_Service_System;
USE Student_Service_System;

-- Drop tables if they exist
DROP TABLE IF EXISTS borrowing;
DROP TABLE IF EXISTS payment;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS specialization;
DROP TABLE IF EXISTS time_slot;
DROP TABLE IF EXISTS subject_page;
DROP TABLE IF EXISTS subject;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS library_item;

-- Library Item table
CREATE TABLE library_item (
    item_code CHAR(10) PRIMARY KEY,
    title CHAR(30),
    author CHAR(30),
    publisher CHAR(20),
    type CHAR(10)
);








-- Payment table
CREATE TABLE payment (
    payment_code CHAR(10) PRIMARY KEY,
    payment_date DATE,
    amount NUMERIC(8, 2),
    method CHAR(50),
    card_number CHAR(16),
    payment_for CHAR(50)
);

-- Student table
CREATE TABLE student (
    student_number CHAR(10) PRIMARY KEY,
    name CHAR(100),
    dob DATE,
    gender CHAR(1),
    nationality CHAR(20),
    email CHAR(30)
);

-- Specialization table
CREATE TABLE specialization (
    spec_code CHAR(50) PRIMARY KEY,
    spec_name CHAR(50),
    spec_description CHAR(50)
);

-- Time Slot table
CREATE TABLE time_slot (
    slot_code CHAR(5) PRIMARY KEY,
    day CHAR(10),
    start_time CHAR(5),
    end_time CHAR(5)
);

-- Subject Page table
CREATE TABLE subject_page (
    subject_code CHAR(10) PRIMARY KEY,
    code_subject CHAR(10),
    name CHAR(100),
    year_of_study CHAR(2)
);

-- Subject table
CREATE TABLE subject (
    subject_code CHAR(10) PRIMARY KEY,
    subject_name CHAR(100),
    semester CHAR(2)
);

-- User table
CREATE TABLE user (
    user_id CHAR(10) PRIMARY KEY,
    username CHAR(20),
    password CHAR(20),
    email CHAR(30)
);


CREATE TABLE library (
    library_code VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100),
    location VARCHAR(100),
    hours VARCHAR(50),
    contact_number VARCHAR(20),
    website VARCHAR(50)
);





-- Borrowing table
CREATE TABLE borrowing (
    item_code CHAR(10),
    student_number CHAR(10),
    issue_date DATE,
    return_date DATE,
    fine NUMERIC(5, 2),
    PRIMARY KEY (item_code, student_number),
    FOREIGN KEY (item_code) REFERENCES library_item(item_code),
    FOREIGN KEY (student_number) REFERENCES student(student_number)
);



