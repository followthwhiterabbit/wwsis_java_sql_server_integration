
/*
USE Student_Service_System; 

-- Inserting into library_item table
INSERT INTO library_item (item_code, title, author, publisher, type) VALUES 
('001', 'Book Title 1', 'Author 1', 'Publisher 1', 'Book'),
('002', 'Book Title 2', 'Author 2', 'Publisher 2', 'Book'),
('003', 'Magazine Title 1', 'Author 3', 'Publisher 3', 'Magazine');

-- Inserting into payment table
INSERT INTO payment (payment_code, payment_date, amount, method, card_number, payment_for) VALUES 
('PAY001', '2024-06-06', 50.00, 'Credit Card', '1234567890123456', 'Library Fine'),
('PAY002', '2024-06-07', 20.00, 'Cash', '', 'Library Fine');

-- Inserting into student table
INSERT INTO student (student_number, name, dob, gender, nationality, email) VALUES 
('S001', 'John Doe', '2000-01-01', 'M', 'American', 'john.doe@example.com'),
('S002', 'Jane Smith', '2001-02-02', 'F', 'British', 'jane.smith@example.com');

-- Inserting into specialization table
INSERT INTO specialization (spec_code, spec_name, spec_description) VALUES 
('SPEC001', 'Computer Science', 'Description for Computer Science'),
('SPEC002', 'Mechanical Engineering', 'Description for Mechanical Engineering');

-- Inserting into time_slot table
INSERT INTO time_slot (slot_code, day, start_time, end_time) VALUES 
('TS001', 'Monday', '09:00', '11:00'),
('TS002', 'Wednesday', '14:00', '16:00');

-- Inserting into subject_page table
INSERT INTO subject_page (subject_code, code_subject, name, year_of_study) VALUES 
('SUB001', 'CS101', 'Introduction to Computer Science', '1'),
('SUB002', 'ME101', 'Introduction to Mechanical Engineering', '1');

-- Inserting into subject table
INSERT INTO subject (subject_code, subject_name, semester) VALUES 
('CS101', 'Introduction to Computer Science', '1'),
('ME101', 'Introduction to Mechanical Engineering', '1');

-- Inserting into user table
INSERT INTO user (user_id, username, password, email) VALUES 
('U001', 'admin', 'admin123', 'admin@example.com'),
('U002', 'user', 'user123', 'user@example.com');

-- Inserting into library table
INSERT INTO library (library_code, name, location, hours, contact_number, website) VALUES 
('LIB001', 'Central Library', '123 Main Street, City, Country', '9:00 AM - 6:00 PM', '+1234567890', 'http://library.example.com'),
('LIB002', 'Branch Library', '456 Elm Street, City, Country', '10:00 AM - 7:00 PM', '+0987654321', 'http://branchlibrary.example.com');

-- Inserting into borrowing table
INSERT INTO borrowing (item_code, student_number, issue_date, return_date, fine) VALUES 
('001', 'S001', '2024-06-01', '2024-06-08', 0.00),
('002', 'S002', '2024-06-02', '2024-06-09', 0.00);

*/




-- Inserting into library_item table
INSERT INTO library_item (item_code, title, author, publisher, type) VALUES 
('001', 'Book Title 1', 'Author 1', 'Publisher 1', 'Book'),
('002', 'Book Title 2', 'Author 2', 'Publisher 2', 'Book'),
('003', 'Magazine Title 1', 'Author 3', 'Publisher 3', 'Magazine');

-- Inserting into student table
INSERT INTO student (student_number, name, dob, gender, nationality, email) VALUES 
('S001', 'John Doe', '2000-01-01', 'M', 'American', 'john.doe@example.com'),
('S002', 'Jane Smith', '2001-02-02', 'F', 'British', 'jane.smith@example.com');

-- Inserting into payment table
INSERT INTO payment (payment_code, payment_date, amount, method, card_number, payment_for) VALUES 
('PAY001', '2024-06-06', 50.00, 'Credit Card', '1234567890123456', 'Library Fine'),
('PAY002', '2024-06-07', 20.00, 'Cash', '', 'Library Fine');

-- Inserting into specialization table
INSERT INTO specialization (spec_code, spec_name, spec_description) VALUES 
('SPEC001', 'Computer Science', 'Description for Computer Science'),
('SPEC002', 'Mechanical Engineering', 'Description for Mechanical Engineering');

-- Inserting into time_slot table
INSERT INTO time_slot (slot_code, day, start_time, end_time) VALUES 
('TS001', 'Monday', '09:00', '11:00'),
('TS002', 'Wednesday', '14:00', '16:00');

-- Inserting into subject_page table
INSERT INTO subject_page (subject_code, code_subject, name, year_of_study) VALUES 
('SUB001', 'CS101', 'Introduction to Computer Science', '1'),
('SUB002', 'ME101', 'Introduction to Mechanical Engineering', '1');

-- Inserting into subject table
INSERT INTO subject (subject_code, subject_name, semester) VALUES 
('CS101', 'Introduction to Computer Science', '1'),
('ME101', 'Introduction to Mechanical Engineering', '1');

-- Inserting into user table
INSERT INTO "user" (user_id, username, password, email) VALUES 
('U001', 'admin', 'admin123', 'admin@example.com'),
('U002', 'user', 'user123', 'user@example.com');

-- Inserting into library table
INSERT INTO library (library_code, name, location, hours, contact_number, website) VALUES 
('LIB001', 'Central Library', '123 Main Street, City, Country', '9:00 AM - 6:00 PM', '+1234567890', 'http://library.example.com'),
('LIB002', 'Branch Library', '456 Elm Street, City, Country', '10:00 AM - 7:00 PM', '+0987654321', 'http://branchlibrary.example.com');

-- Inserting into borrowing table
INSERT INTO borrowing (item_code, student_number, issue_date, return_date, fine) VALUES 
('001', 'S001', '2024-06-01', '2024-06-08', 0.00),
('002', 'S002', '2024-06-02', '2024-06-09', 0.00);
