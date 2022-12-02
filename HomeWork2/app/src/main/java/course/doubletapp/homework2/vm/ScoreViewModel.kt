package course.doubletapp.homework2.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ScoreViewModel: ViewModel() {

    val score: MutableLiveData<Int> = MutableLiveData(0)

    val squareScore: Int
        get() = score.value!! * score.value!!

    fun addScore() { score.value = score.value!! + 1 }
}