package structural.composite

// 단일 파일 클래스(Leaf)
class File(private val name: String) : FileSystemComponent {
    override fun display() {
        println("File: $name")
    }
}