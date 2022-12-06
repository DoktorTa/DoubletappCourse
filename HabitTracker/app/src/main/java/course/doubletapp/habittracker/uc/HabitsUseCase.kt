package course.doubletapp.habittracker.uc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import course.doubletapp.habittracker.data.Habit

class HabitsUseCase {

    private val _habits: MutableLiveData<MutableList<Habit>> = MutableLiveData(mutableListOf())
    val habits: LiveData<MutableList<Habit>>
        get() = _habits

    fun addHabit(habit: Habit){
        _habits.value!!.add(habit)
    }

    fun removeHabit(habit: Habit){
        _habits.value!!.remove(habit)
    }

}