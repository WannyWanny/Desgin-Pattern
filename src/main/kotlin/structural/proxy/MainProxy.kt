package structural.proxy

fun main() {
    // 클라이언트가 ProxyImage를 통해 RealImage에 접근
    val image1: Image = ProxyImage("photo1.jpg")
    val image2: Image = ProxyImage("photo2.jpg")

    // 이미지가 처음 요청될 때만 실제 객체 생성 및 로드
    image1.display() // Loading from disk + Displaying
    image1.display() // Displaying only (이미 로드된 상태)
    image2.display() // Loading from disk + Displaying
}