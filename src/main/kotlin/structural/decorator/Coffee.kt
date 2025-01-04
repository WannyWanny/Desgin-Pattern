package structural.decorator

interface Coffee {
    fun cost(): Int
    fun description(): String
}

class BasicCoffee: Coffee {
    override fun cost(): Int = 5
    override fun description(): String = "Basic Coffee"
}

// 중복 코드를 제거하고, 재사용성을 높이기 위해 추상 클래스 사용
abstract class CoffeeDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Int = coffee.cost()
    override fun description() = coffee.description()
}

class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int = super.cost() + 2
    override fun description(): String = super.description() + ", Milk"
}

class ChocolateDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int = super.cost() + 3
    override fun description(): String = super.description() + ", Chocolate"
}

