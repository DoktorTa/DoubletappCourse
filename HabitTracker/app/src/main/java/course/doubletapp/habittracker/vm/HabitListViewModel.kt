package course.doubletapp.habittracker.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitListViewModel(
    val useCase: HabitsUseCase
): ViewModel() {

    val allHabits: LiveData<MutableList<Habit>> = useCase.habits

    fun removeHabit(nameHabit: String){
        val habit: Habit? = useCase.getHabitForName(nameHabit)
        if (habit !== null){
            useCase.removeHabit(habit)
        }
    }

    fun getHabitForName(nameHabit: String): Habit{
        return useCase.getHabitForName(nameHabit)!!
    }
}