package course.doubletapp.homework2.vm

import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {

    private var _score: Int = 0
    val score: Int
        get() = _score

    val squareScore: Int
        get() = _score * _score

    fun addScore() { _score++ }
}