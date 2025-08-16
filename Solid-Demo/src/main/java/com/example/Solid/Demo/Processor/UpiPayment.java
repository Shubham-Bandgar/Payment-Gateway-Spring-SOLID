package com.example.Solid.Demo.Processor;

public class UpiPayment implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Paid " + amount + " using UPI";
    }
}