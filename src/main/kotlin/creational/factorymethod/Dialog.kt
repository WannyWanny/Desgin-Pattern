package creational.factorymethod

abstract class Dialog {
    abstract fun createButton(): Button

    fun render() {
        val okButton = createButton()
        okButton.onClick { println("Dialog is closing") }
        okButton.render()
    }
}

class WindowsDialog : Dialog() {
    override fun createButton(): Button = WindowButton()
}

class WebDialog : Dialog() {
    override fun createButton(): Button = HTMLButton()
}
