Payment Processor Demo 💳

A demo Spring Boot project that demonstrates how to design a clean, extensible payment processing system using SOLID principles and the Strategy Design Pattern.

✨ Features

Supports multiple payment types (Credit Card, PayPal, UPI, etc.)

Easy to extend – add new payment methods without changing existing code

REST API endpoints for testing via Postman

Clean architecture and folder structure

🏗️ Architecture Diagram
                  +-----------------------+
                  |   PaymentController   |
                  +-----------------------+
                             |
                             v
                  +-----------------------+
                  |   PaymentProcessor    |  <--- Interface
                  +-----------------------+
                             ^
     +------------------------+------------------------+
     |                        |                        |
+----------------+     +----------------+      +----------------+
| CreditCardPayment |   | PaypalPayment  |      |  UpiPayment    |
+----------------+     +----------------+      +----------------+




▶️ How to Run

Clone the repo

git clone <your-repo-url>
cd PaymentProcessorDemo


Run the Spring Boot application

mvn spring-boot:run


Test APIs in Postman:

Credit Card → http://localhost:8080/payment/creditcard?amount=1000

PayPal → http://localhost:8080/payment/paypal?amount=1200

UPI → http://localhost:8080/payment/upi?amount=500
