package behavioral.observer

// 주체 구현 클래스: 유튜브 채널
class YoutubeChannel : Subject {
    private val observers = mutableListOf<Observer>()
    private var latestVideo: String = ""

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(latestVideo)
        }
    }

    fun uploadVideo(videoTitle: String) {
        latestVideo = videoTitle
        println("Uploaded new video: $videoTitle")
        notifyObservers()
    }
}