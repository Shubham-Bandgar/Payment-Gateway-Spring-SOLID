package com.example.Solid.Demo.Controller;

import com.example.Solid.Demo.Processor.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final CreditCardPayment creditCardPayment;
    private final PayPalPayment payPalPayment;
    private final UpiPayment upiPayment;
    private final CryptoPayment cryptoPayment;

    public PaymentController(CreditCardPayment creditCardPayment,
                             PayPalPayment payPalPayment,
                             UpiPayment upiPayment,
                             CryptoPayment cryptoPayment) {
        this.creditCardPayment = creditCardPayment;
        this.payPalPayment = payPalPayment;
        this.upiPayment = upiPayment;
        this.cryptoPayment = cryptoPayment;
    }

    @GetMapping("/creditcard")
    public String payWithCreditCard(@RequestParam double amount) {
        return creditCardPayment.processPayment(amount);
    }

    @GetMapping("/paypal")
    public String payWithPaypal(@RequestParam double amount) {
        return payPalPayment.processPayment(amount);
    }

    @GetMapping("/upi")
    public String payWithUpi(@RequestParam double amount) {
        return upiPayment.processPayment(amount);
    }

    @GetMapping("/crypto")
    public String payWithCrypto(@RequestParam double amount) {
        return cryptoPayment.processPayment(amount);
    }
}
