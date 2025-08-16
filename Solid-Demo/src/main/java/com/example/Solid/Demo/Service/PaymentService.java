package com.example.Solid.Demo.Service;

import com.example.Solid.Demo.Processor.PaymentProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentProcessor varOcg;

    public PaymentService(@Qualifier("upiProcessor") PaymentProcessor varOcg) {
        this.varOcg = varOcg;
    }

    public String makePayment(double amount) {
        return varOcg.processPayment(amount);
    }
}
