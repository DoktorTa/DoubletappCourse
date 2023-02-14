package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import java.util.Date

class HabitCreateViewModel(
    private val useCase: course.doubletapp.habittracker.domain.uc.HabitsUseCase
): ViewModel() {

    fun addHabit(
        name: String,
        description: String,
        priority: course.doubletapp.habittracker.domain.entity.PriorityHabit,
        type: course.doubletapp.habittracker.domain.entity.TypeHabit,
        countDay: Int,
        period: Int,
        color: Int,
    ){
        val habitOld = getHabitByName(name)
        val habitNew = course.doubletapp.habittracker.domain.entity.Habit(
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

    fun getHabitByName(name: String): course.doubletapp.habittracker.domain.entity.Habit? {
        return useCase.getHabitByName(name)
    }
}