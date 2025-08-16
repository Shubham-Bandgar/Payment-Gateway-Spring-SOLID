package com.example.Solid.Demo.Processor;

import org.springframework.stereotype.Service;

@Service("creditCardProcessor") // Spring will manage this bean
public class CreditCardPayment implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Paid " + amount + " using Credit Card";
    }
}
