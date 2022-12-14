package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitCreateViewModel(
    private val useCase: HabitsUseCase
): ViewModel() {

    fun addHabit(
        name: String,
        description: String,
        priority: String,
        type: String,
        countDay: Int,
        period: Int,
        color: Int
    ){
        useCase.addHabit(Habit(name, description, priority, type, countDay, period, color))
    }
}