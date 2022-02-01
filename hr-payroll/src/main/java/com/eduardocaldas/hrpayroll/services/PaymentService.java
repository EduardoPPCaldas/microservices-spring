package com.eduardocaldas.hrpayroll.services;

import com.eduardocaldas.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(Long worker_id, int days){
        return new Payment("Bob", 200.0, days);
    }
}
