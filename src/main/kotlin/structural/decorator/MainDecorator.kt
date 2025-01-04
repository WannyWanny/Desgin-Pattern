package structural.decorator

// 클라이언트 코드
fun main() {
    // 기본 커피
    var coffee: Coffee = BasicCoffee()
    println("${coffee.description()} costs \$${coffee.cost()}")

    // 우유 추가
    coffee = MilkDecorator(coffee)
    println("${coffee.description()} costs \$${coffee.cost()}")

    // 초콜릿 추가
    coffee = ChocolateDecorator(coffee)
    println("${coffee.description()} costs \$${coffee.cost()}")

    /**
     * Basic Coffee costs $5
     * Basic Coffee, Milk costs $7
     * Basic Coffee, Milk, Chocolate costs $10
     */
}