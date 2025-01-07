package behavioral.state

// TV 클래스: 상태 관리 및 행동 위임
class TV {
    private var state: State = OffState()  // 초기 상태는 꺼짐 상태

    fun setState(newState: State) {
        state = newState
    }

    fun pressPowerButton() {
        state.pressPowerButton(this)
    }
}

fun main() {
    val tv = TV()

    // 전원 버튼을 여러 번 눌러 상태 전환 테스트
    tv.pressPowerButton()
    tv.pressPowerButton()
    tv.pressPowerButton()

    /**
     * TV Turning On
     * TV Turning Off
     * TV Turning On
     */
}