package com.wwsis.sss.dao; 

import java.util.List; 
import com.pl.wwsis.sss.model.Specialization; 

public interface SpecializationDao{
    List<Specialization> getAllSpecializations(); 
    Specialization getSpecializationById(String specCode); 
    void saveSpecialization(Specialization specialization); 
    void updateSpecialization(Specialization specialization); 
    void delteSpecialization(String specCode); 

}