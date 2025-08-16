package com.example.Solid.Demo.Processor;

// __define-ocg__ Base interface for all payment types
public interface PaymentProcessor {
    String processPayment(double amount);
}

