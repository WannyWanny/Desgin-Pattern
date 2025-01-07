package behavioral.observer

// 옵저버 구현 클래스
class Subscriber(private val name: String) : Observer {
    override fun update(data: String) {
        println("$name received notification: New video uploaded - $data")
    }
}

// 클라이언트 코드
fun main() {
    // 주체(유튜브 채널) 생성
    val channel = YoutubeChannel()

    // 옵저버(구독자) 생성
    val subscriber1 = Subscriber("Alice")
    val subscriber2 = Subscriber("Bob")

    // 옵저버 등록
    channel.addObserver(subscriber1)
    channel.addObserver(subscriber2)

    // 새로운 영상 업로드
    channel.uploadVideo("Observer Pattern in Kotlin")

    // Bob이 구독 취소
    channel.removeObserver(subscriber2)

    // 또 다른 영상 업로드
    channel.uploadVideo("Kotlin Design Patterns")

    /**
     * Uploaded new video: Observer Pattern in Kotlin
     * Alice received notification: New video uploaded - Observer Pattern in Kotlin
     * Bob received notification: New video uploaded - Observer Pattern in Kotlin
     * Uploaded new video: Kotlin Design Patterns
     * Alice received notification: New video uploaded - Kotlin Design Patterns
     */
}