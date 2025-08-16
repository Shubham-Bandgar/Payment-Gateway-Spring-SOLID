package com.example.Solid.Demo.Processor;

import org.springframework.stereotype.Service;

@Service("paypalProcessor")
public class PayPalPayment implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Paid " + amount + " using PayPal";
    }
}
