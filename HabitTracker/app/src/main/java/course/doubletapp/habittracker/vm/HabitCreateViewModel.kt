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
        useCase.createHabit(Habit(name, description, priority, type, countDay, period, color))
    }
}