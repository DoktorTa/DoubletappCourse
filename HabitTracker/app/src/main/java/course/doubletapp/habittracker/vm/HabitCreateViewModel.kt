package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitCreateViewModel(
    private val useCase: HabitsUseCase
): ViewModel() {

    fun addHabit(
        name: String,
        description: String,
        priority: PriorityHabit,
        type: TypeHabit,
        countDay: Int,
        period: Int,
        color: Int
    ){
        val habitOld = getHabitByName(name)
        val habitNew = Habit(name, description, priority, type, countDay, period, color)

        if (habitOld != null){
            useCase.editHabit(habitOld, habitNew)
        } else {
            useCase.createHabit(habitNew)
        }
    }

    fun getHabitByName(name: String): Habit? {
        return useCase.getHabitByName(name)
    }
}