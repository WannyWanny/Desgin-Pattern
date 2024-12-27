package creational.singleton

class Logger1 {
    fun log(message: String) {
        println("Log: $message")
    }
}

fun main() {
    val logger1 = Logger1()
    val logger2 = Logger1()

    logger1.log("This is log1")
    logger2.log("This is log2")

    println(logger1 == logger2) // false
}