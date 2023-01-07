package course.doubletapp.habittracker.uc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit

class HabitsUseCase {

    private val _habits: MutableLiveData<MutableSet<Habit>> = MutableLiveData(mutableSetOf())
    val habits: MutableLiveData<MutableSet<Habit>>
        get() = _habits

    init {
        val habit1 = Habit("One", "Description", PriorityHabit.HARD, TypeHabit.GOOD, 4, 5, -41277634)
        val habit2 = Habit("Two", "Description", PriorityHabit.HARD, TypeHabit.BAD, 4, 5, -554234)
        val habit3 = Habit("Three", "Description", PriorityHabit.HARD, TypeHabit.BAD, 4, 5, -5534)
        val habit4 = Habit("Four", "Description", PriorityHabit.HARD, TypeHabit.GOOD, 4, 5, -12)
        val habit5 = Habit("Five", "Description", PriorityHabit.HARD, TypeHabit.BAD, 4, 5, -12)

        val arrayHabits = arrayOf(habit1, habit2, habit3, habit4, habit5)
        arrayHabits.forEach {
            _habits.value!!.add(it)
        }
    }

    fun createHabit(habit: Habit){
        _habits.value!!.add(habit)
    }

    fun editHabit(oldHabit: Habit, newHabit: Habit){
        _habits.value!!.remove(oldHabit)
        createHabit(newHabit)
    }


    fun removeHabit(habit: Habit){
        _habits.value!!.remove(habit)
    }

    fun getHabitByName(nameHabit: String): Habit?{
        _habits.value!!.forEach {
            if (it.name == nameHabit){
                return it
            }
        }
        return null
    }

}