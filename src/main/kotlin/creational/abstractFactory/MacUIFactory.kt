package creational.abstractFactory

// 구체적인 팩토리 구현
class MacUIFactory : UIFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckBox(): Checkbox {
        return MacCheckbox()
    }
}