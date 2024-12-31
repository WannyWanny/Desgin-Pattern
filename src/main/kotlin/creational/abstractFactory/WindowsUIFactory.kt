package creational.abstractFactory

// 구체적인 팩토리 구현
class WindowsUIFactory : UIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckBox(): Checkbox {
        return WindowsCheckbox()
    }
}