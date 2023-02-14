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
    fun createHabit(habit: course.doubletapp.habittracker.domain.entity.Habit){
        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.createHabit(habit)
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.createHabit", "Error connection")
            }
        }
    }

    fun editHabit(newHabit: course.doubletapp.habittracker.domain.entity.Habit){
        repository.editHabit(newHabit)
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun removeHabit(habit: course.doubletapp.habittracker.domain.entity.Habit){
        GlobalScope.launch(Dispatchers.IO){
            val apiResponse = repository.removeHabit(habit)
            if (apiResponse is course.doubletapp.habittracker.domain.ApiResponse.Error){
                Log.d("HabitServerRepository.removeHabit", "Error connection")
            }
        }
    }

    fun getHabitByName(nameHabit: String): course.doubletapp.habittracker.domain.entity.Habit?{
        return repository.getHabitByName(nameHabit)
    }

}