package structural.proxy

class ProxyImage(private val fileName: String): Image {
    private var realImage: RealImage? = null

    //이미지 표시 요청시 실제 객체 생성 및 호출
    override fun display() {
        if (realImage == null) {
            realImage = RealImage(fileName) // 실제 객체 생성
        }
        realImage?.display()
    }
}