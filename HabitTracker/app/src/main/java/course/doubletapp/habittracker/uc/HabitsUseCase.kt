package course.doubletapp.habittracker.uc

import androidx.lifecycle.MutableLiveData
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit

class HabitsUseCase {

    private val _habits: MutableLiveData<MutableSet<Habit>> = MutableLiveData(mutableSetOf())
    val habits: MutableLiveData<MutableSet<Habit>>
        get() = _habits

    init {
        val habit1 = Habit("One", "Description1", PriorityHabit.HARD, TypeHabit.GOOD, 1, 5, -41277634)
        val habit2 = Habit("Two", "Description2", PriorityHabit.MEDIUM, TypeHabit.BAD, 2, 4, -554234)
        val habit3 = Habit("Three", "Description3", PriorityHabit.LOW, TypeHabit.BAD, 3, 3, -5534)
        val habit4 = Habit("Four", "Description4", PriorityHabit.LOW, TypeHabit.GOOD, 4, 2, -12)
        val habit5 = Habit("Five", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)

        val arrayHabits = arrayOf(habit1, habit2, habit3, habit4, habit5)
        arrayHabits.forEach {
            _habits.value!!.add(it)
        }
    }

    fun createHabit(habit: Habit){
        val set = _habits.value!!
        set.add(habit)
        _habits.value = set
    }

    fun editHabit(oldHabit: Habit, newHabit: Habit){
        val set = _habits.value!!
        set.remove(oldHabit)
        _habits.value = set
        createHabit(newHabit)
    }

    fun removeHabit(habit: Habit){
        val set = _habits.value!!
        set.remove(habit)
        _habits.value = set
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