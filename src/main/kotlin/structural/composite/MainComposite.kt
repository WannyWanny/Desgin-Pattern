package structural.composite

fun main() {
    val file1 = File("File1.txt")
    val file2 = File("File2.txt")
    val file3 = File("File3.txt")

    val folder1 = Folder("Folder1")
    folder1.add(file1)
    folder1.add(file2)

    val folder2 = Folder("Folder2")
    folder2.add(file3)
    folder2.add(folder1)

    folder2.display()
    /**
     * Folder: Folder2
     * File: File3.txt
     * Folder: Folder1
     * File: File1.txt
     * File: File2.txt
     */
}