package com.wwsis.sss.dao;

import java.util.List; 
import com.pl.wwsis.sss.model.Payment; 

public interface PaymentDao{
    List<Payment> getAllPayments(); 
    Payment getPaymentById(String paymentCode); 
    void savePayment(Payment payment); 
    void updatePayment(Payment payment); 
    void deletePayment(String paymentCode);
}
