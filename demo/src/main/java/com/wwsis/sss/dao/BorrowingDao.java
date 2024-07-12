package com.wwsis.sss.dao;


import java.util.List; 
import com.pl.wwsis.sss.model.Borrowing;

public interface BorrowingDao {
    List<Borrowing> getAllBorrowings(); 
    Borrowing getBorrowingById(String borrowingId); 
    void saveBorrowing(Borrowing borrowing); 
    void updateBorrowing(Borrowing borrowing); 
    void deleteBorrowing(String borrowing);
    
}

