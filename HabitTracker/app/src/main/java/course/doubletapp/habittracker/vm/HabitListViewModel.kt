package course.doubletapp.habittracker.vm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitListViewModel(
    val useCase: HabitsUseCase,
    private val typeHabitsInPage: TypeHabit
): ViewModel() {

    private var allHabits: MutableLiveData<MutableList<Habit>> = useCase.habits
    lateinit var filteredAllHabits: LiveData<MutableList<Habit>>
    var nowFilters: Filters = Filters(null, null, typeHabitsInPage, null)

    init {
        allHabits = MutableLiveData(applyFilters(nowFilters, allHabits.value!!))
        Log.d("HabitListViewModel", "${allHabits.value}")
        filteredAllHabits = allHabits
//        setObserver()
    }

    private fun setObserver(){
        allHabits.observeForever {
            val habitAfterFilter: MutableList<Habit> = applyFilters(nowFilters, useCase.habits.value!!)
            filteredAllHabits.value!!.addAll(habitAfterFilter)
        }
    }

    fun applyFilters(filters: Filters, filteredObject: MutableList<Habit> = allHabits.value!!): MutableList<Habit>{
        val filtrateObjects: MutableList<Habit> = mutableListOf()

        if (filters.type != null){
            filtrateObjects.addAll(filteredObject.filterByType(filters.type))
        }

        return filtrateObjects
    }

    fun removeHabit(nameHabit: String){
        val habit: Habit? = useCase.getHabitByName(nameHabit)
        if (habit !== null){
            useCase.removeHabit(habit)
        }
    }

    fun getHabitForName(nameHabit: String): Habit{
        return useCase.getHabitByName(nameHabit)!!
    }

}

data class Filters(
    val name: String?,
    val description: String?,
    val type: TypeHabit?,
    val priority: PriorityHabit?
){}

fun MutableList<Habit>.filterByType(valueFilter: TypeHabit): MutableList<Habit> {
    val filteredAllHabits: MutableList<Habit> = this.filter{
        it.type == valueFilter
    }.toMutableList()
    return filteredAllHabits
}