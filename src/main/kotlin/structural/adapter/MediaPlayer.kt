package structural.adapter

// 클라이언가 원하는 인터페이스
interface MediaPlayer {
    fun play(fileName: String)
}

// 이미 구현되어 있는 클래스
class AdvancedMediaPlayer {
    fun playMp4(fileName: String) {
        println("Playing MP4 file: $fileName")
    }

    fun playVlc(fileName: String) {
        println("Playing Vlc file: $fileName")
    }
}

class MediaAdapter : MediaPlayer {
    private val advancedMediaPlayer = AdvancedMediaPlayer()

    override fun play(fileName: String) {
        when {
            fileName.endsWith(".mp4") -> advancedMediaPlayer.playMp4(fileName)
            fileName.endsWith(".vlc") -> advancedMediaPlayer.playVlc(fileName)
            else -> println("Unsupported File Format: $fileName")
        }
    }

}

fun main() {
    val player: MediaPlayer = MediaAdapter()
    player.play("video.mp4")
    player.play("movie.vlc")
    player.play("test.mp3")
}
