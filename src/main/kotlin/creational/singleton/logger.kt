package creational.singleton

object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}

fun main() {
    val logger1 = Logger
    val logger2 = Logger

    logger1.log("This is log1")
    logger2.log("This is log2")

    println(logger1 == logger2) // true
}