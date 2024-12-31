package creational.abstractFactory

// 클라이언트 코드: 추상 팩토리 인터페이스만 사용하여 UI 생성
fun createUI(factory: UIFactory) {
    val button = factory.createButton() // 팩토리를 통해 버튼 생성
    val checkbox = factory.createCheckBox() // 팩토리를 통해 체크박스 생성

    button.render() // 생성된 버튼 렌더링
    checkbox.render() // 생성된 체크박스 렌더링
}

// 실행 예제: 클라이언트는 구체적인 팩토리만 설정하면 됨
fun main() {
    val os = "Windows"

    val factory: UIFactory = if (os == "Windows") {
        WindowsUIFactory()
    } else {
        MacUIFactory()
    }

    createUI(factory)
}