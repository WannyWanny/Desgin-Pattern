package behavioral.state

// 상태 인터페이스
interface State {
    fun pressPowerButton(tv: TV)
}

// 꺼짐 상태 구현
class OffState: State {
    override fun pressPowerButton(tv: TV) {
        println("TV Turning On")
        tv.setState(OnState())
    }
}

// 켜짐 상태 구현
class OnState: State {
    override fun pressPowerButton(tv: TV) {
        println("TV Turning Off")
        tv.setState(OffState())
    }
}