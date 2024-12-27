package creational.factorymethod

interface Button {
    fun render()
    fun onClick(action:() -> Unit)
}

class WindowButton: Button {
    override fun render() {
        println("Rendering a Window Button")
    }

    override fun onClick(action: () -> Unit) {
        println("Window Button Clicked")
        action()
    }
}

class HTMLButton: Button {
    override fun render() {
        println("Rendering a HTML Button")
    }

    override fun onClick(action: () -> Unit) {
        println("HTML Button Clicked")
        action()
    }
}
