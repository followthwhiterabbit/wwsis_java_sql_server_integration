package com.wwsis.sss.dao;

import java.util.List; 

import com.pl.wwsis.sss.model.Library;

public interface LibraryDao{
    List<Library> getAllLibraries(); 
    Library getLibraryById(String libraryCode); 
    void saveLibrary(Library library);
    void updateLibrary(Library library);
    void deleteLibrary(String LibraryCode);


}


