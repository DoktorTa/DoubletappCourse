package course.doubletapp.habittracker.domain.uc

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import course.doubletapp.habittracker.domain.ApiResponse
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.repository.IRepository
import java.util.*
import javax.inject.Inject

class HabitsUseCase @Inject constructor(
    private val repository: IRepository
    ) {

    val habits: LiveData<List<Habit>> = repository.getAllHabit().asLiveData()

    suspend fun loadHabitFromServer(){
        val apiResponse = repository.loadHabitFromServer()
        if (apiResponse is ApiResponse.Error){
            Log.d("HabitServerRepository.loadHabitFromServer", "Error connection")
        }
    }

    suspend fun createHabit(habit: Habit){
        val apiResponse = repository.createHabit(habit)
        if (apiResponse is ApiResponse.Error){
            Log.d("HabitServerRepository.createHabit", "Error connection")
        }
    }

    suspend fun removeHabit(habit: Habit){
        val apiResponse = repository.removeHabit(habit)
        if (apiResponse is ApiResponse.Error){
            Log.d("HabitServerRepository.removeHabit", "Error connection")
        }
    }

    fun getHabitById(nameId: String): Habit?{
        return repository.getHabitById(nameId)
    }

    private fun updateDoneDate(habit: Habit): Habit{
        val secondOnDay: Int = 60 * 60 * 24
        val secondPeriod = habit.period * secondOnDay
        val nowTime: Int = (Date().time / 1000).toInt()

        if (habit.date <= nowTime - secondPeriod){
            habit.doneDates = listOf(nowTime)
            habit.date = nowTime
        } else {
            habit.doneDates = habit.doneDates + listOf(nowTime)
        }

        return habit
    }

    private suspend fun completeHabitOnServer(habit: Habit){
        val habitAfterUpdate = updateDoneDate(habit)

        val apiResponse = repository.doneHabit(habitAfterUpdate)
        if (apiResponse is ApiResponse.Error){
            Log.d("HabitServerRepository.removeHabit", "Error connection")
        }
    }

    private fun getNumberRemainingExecutions(habit: Habit): Int {
        val countBeDone = habit.doneDates.count()
        return habit.count - countBeDone
    }

    suspend fun completeHabit(idHabit: String): Pair<CompleteHabitText, Int?> {
        val habit: Habit = getHabitById(idHabit)!!

        completeHabitOnServer(habit)

        val remainingExec = getNumberRemainingExecutions(habit)
        if (habit.type == TypeHabit.BAD){
            if (remainingExec > 0) {
                return Pair(CompleteHabitText.BAD_REMAINING, remainingExec)
            } else {
                return Pair(CompleteHabitText.BAD_MORE, null)
            }

        } else if (habit.type == TypeHabit.GOOD){
            if (remainingExec > 0){
                return Pair(CompleteHabitText.GOOD_REMAINING, remainingExec)
            } else {
                return Pair(CompleteHabitText.GOOD_MORE, null)
            }
        }
        return Pair(CompleteHabitText.ERROR, null)
    }

}

enum class CompleteHabitText{
    BAD_REMAINING,
    BAD_MORE,
    GOOD_MORE,
    GOOD_REMAINING,
    ERROR,
}