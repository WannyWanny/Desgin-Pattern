package creational.abstractFactory

//추상 팩토리 인터페이스 정의
interface UIFactory {
    fun createButton(): Button
    fun createCheckBox(): Checkbox
}