package structural.proxy

// 실제 이미지 클래스
class RealImage(private val fileName: String) : Image{
    init {
        loadImageFromDist()
    }

    //실제 이미지 로드 작업
    private fun loadImageFromDist() {
        println("Loading image from disk: $fileName")
    }

    // 이미지를 표시하는 메서드
    override fun display() {
        println("Displaying Image: $fileName")
    }
}