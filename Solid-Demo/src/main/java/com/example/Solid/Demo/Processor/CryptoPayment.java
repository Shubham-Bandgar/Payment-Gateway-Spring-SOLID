package com.example.Solid.Demo.Processor;


public class CryptoPayment implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Paid " + amount + " using Crypto";
    }
}
