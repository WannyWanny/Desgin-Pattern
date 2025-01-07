package behavioral.strategy

// 클라이언트 클래스(컨텍스트)
class PaymentProcessor(private var strategy: PaymentStrategy) {

    //전략 변경 메소드
    fun setStrategy(strategy: PaymentStrategy) {
        this.strategy = strategy
    }

    // 결제 수행 메소드
    fun executePayment(amount: Int) {
        strategy.pay(amount)
    }
}

// 클라이언트 실행 코드
fun main() {
    // 결제 처리기 생성
    val processor = PaymentProcessor(CreditCardPayment("1234-5678-9012-3456"))

    // 신용카드 결제 수행
    processor.executePayment(100)

    // 결제 전략을 PayPal로 변경
    processor.setStrategy(PayPalPayment("user@example.com"))

    // PayPal 결제 수행
    processor.executePayment(150)

    /**
     * Paid $100 using Credit Card: 1234-5678-9012-3456
     * Paid $150 using PayPal account: user@example.com
     */
}