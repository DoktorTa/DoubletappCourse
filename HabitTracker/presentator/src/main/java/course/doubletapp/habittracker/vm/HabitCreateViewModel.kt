package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HabitCreateViewModel @Inject constructor(
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
        id: String,
        date: Int,
        doneDate: List<Int>
    ) {
        val habitNew = Habit(
            name = name,
            description = description,
            priority = priority,
            type = type,
            count = countDay,
            period = period,
            color = color,
            id = id,
            date = date,
            doneDates = doneDate
        )

        viewModelScope.launch {
            useCase.createHabit(habitNew)
        }
    }

    fun getHabitByName(idHabit: String): Habit? {
        return useCase.getHabitById(idHabit)
    }
}