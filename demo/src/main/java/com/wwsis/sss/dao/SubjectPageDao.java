package com.wwsis.sss.dao; 

import java.util.List; 
import com.pl.wwsis.sss.model.SubjectPage; 

public interface SubjectPageDao {
    List<SubjectPage> getAllSubjectPages(); 
    SubjectPage getSubjectPageById(String subjectCode);
    void saveSubjectPage(SubjectPage subjectPage); 
    void updateSubjectPage(SubjectPage  subjectPage);
    void deleteSubjectPage(String subjectCode); 
}

