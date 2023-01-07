package course.doubletapp.habittracker.vm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitListViewModel(
    val useCase: HabitsUseCase,
    private val typeHabitsInPage: TypeHabit
): ViewModel() {

    private var allHabits: MutableLiveData<MutableSet<Habit>> = useCase.habits
    lateinit var filteredAllHabits: LiveData<MutableSet<Habit>>
    var nowFilters: Filters = Filters(null, null, typeHabitsInPage, null)

    init {
        allHabits = MutableLiveData(applyFilters(nowFilters, allHabits.value!!))
        Log.d("HabitListViewModel", "${allHabits.value}")
        filteredAllHabits = allHabits
//        setObserver()
    }

//    private fun setObserver(){
//        allHabits.observeForever {
//
//            val habitAfterFilter: MutableSet<Habit> = applyFilters(nowFilters, useCase.habits.value!!)
//            filteredAllHabits.value!!.addAll(habitAfterFilter)
//        }
//    }

    fun applyFilters(filters: Filters, filteredObject: MutableSet<Habit> = allHabits.value!!): MutableSet<Habit>{
        val filtrateObjects: MutableSet<Habit> = mutableSetOf()

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
        Log.d("HabitListViewModel", "${useCase.habits.value}")
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

fun MutableSet<Habit>.filterByType(valueFilter: TypeHabit): MutableSet<Habit> {
    val filteredAllHabits: MutableSet<Habit> = this.filter{
        it.type == valueFilter
    }.toMutableSet()
    return filteredAllHabits
}