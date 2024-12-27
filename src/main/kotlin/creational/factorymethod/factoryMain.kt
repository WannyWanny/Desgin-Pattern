package creational.factorymethod

fun main() {
    val windowDialog = WindowsDialog()
    windowDialog.render()

    val webDialog = WebDialog()
    webDialog.render()
}