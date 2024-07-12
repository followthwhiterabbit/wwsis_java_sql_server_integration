package com.wwsis.sss.dao;

import java.util.List; 
import com.pl.wwsis.sss.model.Subject;

public interface SubjectDao{
    List<Subject> getALlSubjects(); 
    Subject getSubjectById(String subjectCode); 
    void saveSubject(Subject subject); 
    void updateSubject(Subject subject); 
    void deleteSubject(String subjectCode); 
}

