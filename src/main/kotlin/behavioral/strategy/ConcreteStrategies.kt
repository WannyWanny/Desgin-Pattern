package behavioral.strategy

// 신용카드 결제 전략
class CreditCardPayment(private val cardNumber: String) : PaymentStrategy {
    override fun pay(amount: Int) {
        println("Paid $$amount using Credit Card: $cardNumber")
    }
}

// 페이팔 결제 전략
class PayPalPayment(private val email: String) : PaymentStrategy {
    override fun pay(amount: Int) {
        println("Paid $$amount using PayPal account: $email")
    }
}