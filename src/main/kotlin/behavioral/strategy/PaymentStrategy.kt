package behavioral.strategy

// 전략 인터페이스
interface PaymentStrategy {
    fun pay(amount: Int)
}