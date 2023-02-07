package course.doubletapp.habittracker.uc

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.db.HabitRepository
import course.doubletapp.habittracker.db.IRepository

class HabitsUseCase(
    private val repository: IRepository
    ) {

    val habits: LiveData<List<Habit>> = repository.getAllHabit().asLiveData()

    init {
        val habit1 = Habit("One", "Description1", PriorityHabit.HARD, TypeHabit.GOOD, 1, 5, -41277634)
        val habit2 = Habit("Two", "Description2", PriorityHabit.MEDIUM, TypeHabit.BAD, 2, 4, -554234)
        val habit3 = Habit("Three", "Description3", PriorityHabit.LOW, TypeHabit.BAD, 3, 3, -5534)
        val habit4 = Habit("Four", "Description4", PriorityHabit.LOW, TypeHabit.GOOD, 4, 2, -12)
        val habit5 = Habit("Five", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)

        val habit6 = Habit("Five6", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit7 = Habit("Five7", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit8 = Habit("Five8", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit9 = Habit("Five9", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit10 = Habit("Five10", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit11 = Habit("Five11", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit12 = Habit("Five12", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit13 = Habit("Five13", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit14 = Habit("Five14", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)
        val habit15 = Habit("Five15", "Description5", PriorityHabit.HARD, TypeHabit.BAD, 5, 1, -12)

        val arrayHabits = arrayOf(habit1, habit2, habit3, habit4, habit5, habit6, habit7, habit8, habit9, habit10, habit11, habit12, habit13, habit14, habit15)
        arrayHabits.forEach {
            repository.createHabit(it)
        }
    }

    fun createHabit(habit: Habit){
        repository.createHabit(habit)
    }

    fun editHabit(newHabit: Habit){
        repository.editHabit(newHabit)
    }

    fun removeHabit(habit: Habit){
        repository.removeHabit(habit)
    }

    fun getHabitByName(nameHabit: String): Habit?{
        return repository.getHabitByName(nameHabit)
    }

}