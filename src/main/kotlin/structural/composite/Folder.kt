package structural.composite

// 복합 객체인 폴더 클래스(Composite)
class Folder(private val name: String) : FileSystemComponent {
    private val components = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        components.add(component)
    }

    override fun display() {
        println("Folder: $name")
        for (component in components) {
            component.display()
        }
    }
}
