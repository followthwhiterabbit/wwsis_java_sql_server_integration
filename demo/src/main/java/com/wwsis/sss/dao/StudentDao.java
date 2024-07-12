package com.wwsis.sss.dao; 

import java.util.List; 
import com.pl.wwsis.sss.model.Student;

public interface StudentDao {
    List<Student> getAllStudents(); 
    Student getStudentById(String studentNumber); 
    void saveStudent(Student student); 
    void updateStudent(Student student); 
    void deleteStudent(String studentNumber); 
    }

    