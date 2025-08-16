package com.example.Solid.Demo.Service;


import com.example.Solid.Demo.Processor.CreditCardPayment;
import com.example.Solid.Demo.Processor.CryptoPayment;
import com.example.Solid.Demo.Processor.PayPalPayment;
import com.example.Solid.Demo.Processor.UpiPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public CreditCardPayment creditCardProcessor() {
        return new CreditCardPayment();
    }

    @Bean
    public PayPalPayment paypalProcessor() {
        return new PayPalPayment();
    }

    @Bean
    public UpiPayment upiProcessor() {
        return new UpiPayment();
    }

    @Bean
    public CryptoPayment cryptoProcessor() {
        return new CryptoPayment();
    }
}
