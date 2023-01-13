package course.doubletapp.habittracker.vm

import android.util.Log
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

    var allHabits: MutableLiveData<MutableSet<Habit>> = useCase.habits
    var nowFilters: Filters = Filters(null, null, typeHabitsInPage, null)

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