package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.uc.HabitsUseCase
import java.util.Date
import kotlin.random.Random

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
        color: Int,
    ){
        val habitOld = getHabitByName(name)
        val habitNew = Habit(
            name = name,
            description = description,
            priority = priority,
            type = type,
            countDay = countDay,
            period = period,
            color = color,
            id = "",
            date = (Date().time / 1000).toInt()
        )

        if (habitOld != null){
            useCase.editHabit(habitNew)
        } else {
            useCase.createHabit(habitNew)
        }
    }

    fun getHabitByName(name: String): Habit? {
        return useCase.getHabitByName(name)
    }
}