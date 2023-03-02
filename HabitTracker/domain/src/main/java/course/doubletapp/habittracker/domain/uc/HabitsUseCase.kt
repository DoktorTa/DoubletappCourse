package course.doubletapp.habittracker.domain.uc

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.repository.IRepository
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

class HabitsUseCase @Inject constructor(
    private val repository: IRepository
    ) {

    val habits: LiveData<List<Habit>> = repository.getAllHabit().asLiveData()

    @OptIn(DelicateCoroutinesApi::class)
    fun loadHabitFromServer(){
        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.loadHabitFromServer()
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.loadHabitFromServer", "Error connection")
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun createHabit(habit: Habit){
        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.createHabit(habit)
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.createHabit", "Error connection")
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun editHabit(newHabit: Habit){
        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.editHabit(newHabit)
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.editHabit", "Error connection")
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun removeHabit(habit: Habit){
        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.removeHabit(habit)
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.removeHabit", "Error connection")
            }
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

    @OptIn(DelicateCoroutinesApi::class)
    fun completeHabit(habit: Habit){
        val habitAfterUpdate = updateDoneDate(habit)

        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.doneHabit(habitAfterUpdate)
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.removeHabit", "Error connection")
            }
        }
    }

    fun getNumberRemainingExecutions(habit: Habit): Int{
        val countBeDone = habit.doneDates.count()
        return habit.count - countBeDone
    }

}