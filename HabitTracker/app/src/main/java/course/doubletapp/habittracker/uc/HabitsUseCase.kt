package course.doubletapp.habittracker.uc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit

class HabitsUseCase {

    private val _habits: MutableLiveData<MutableList<Habit>> = MutableLiveData(mutableListOf())
    val habits: LiveData<MutableList<Habit>>
        get() = _habits

    init {
        _habits.value!!.add(Habit("One", "Description", PriorityHabit.HARD.toString(), TypeHabit.GOOD.toString(), 4, 5, -41277634))
        _habits.value!!.add(Habit("Two", "Description", PriorityHabit.HARD.toString(), TypeHabit.GOOD.toString(), 4, 5, -554234))
    }

    fun addHabit(habit: Habit){
        _habits.value!!.add(habit)
    }

    fun removeHabit(habit: Habit){
        _habits.value!!.remove(habit)
    }

    fun getHabitForName(nameHabit: String): Habit?{
        _habits.value!!.forEach {
            if (it.name == nameHabit){
                return it
            }
        }
        return null
    }

}