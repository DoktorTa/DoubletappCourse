package course.doubletapp.habittracker.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitListViewModel(
    val useCase: HabitsUseCase,
//    private val typeHabitsInPage: TypeHabit
): ViewModel() {

    private var typeHabitsInPage: TypeHabit? = null
    var allHabits: MutableLiveData<MutableSet<Habit>> = useCase.habits
//    var nowFilters: Filters = Filters(null, null, typeHabitsInPage, null)
    val nowFilters: MutableLiveData<Filters> = MutableLiveData(Filters(null, null, null, null))


    fun applyFilters(filters: Filters, filteredObject: MutableSet<Habit> = allHabits.value!!): MutableSet<Habit>{
        var filtrateObjects: Set<Habit> = setOf()

        if (filters.type != null){
            filtrateObjects = filteredObject.filterByType(filters.type!!)
        }

        if (filters.priority != null) {
            filtrateObjects = filtrateObjects.intersect(filteredObject.filterByPriority(filters.priority!!))
        }

        if (filters.name != null) {
            filtrateObjects = filtrateObjects.intersect(filteredObject.filterByName(filters.name!!))
        }

        if (filters.description != null) {
            filtrateObjects = filtrateObjects.intersect(filteredObject.filterByDescription(filters.description!!))
        }

        return filtrateObjects.toMutableSet()
    }

    fun searchByName(name: String){
        val f = nowFilters.value!!

        if (name != "") {
            f.name = name
        } else {
            f.name = null
        }

        nowFilters.value = f
    }

    fun searchByDescription(description: String){
        val f = nowFilters.value!!

        if (description != "") {
            f.description = description
        } else {
            f.description = null
        }

        nowFilters.value = f
    }

    fun searchByPriority(priority: PriorityHabit?){
        val f = nowFilters.value!!

        if (priority != null) {
            f.priority = priority
        } else {
            f.priority = null
        }

        nowFilters.value = f
    }

    fun resetFilter(typeHabits: TypeHabit? = typeHabitsInPage){
        typeHabitsInPage = typeHabits
        nowFilters.value = Filters(null, null, typeHabitsInPage, null)
    }

    fun removeHabit(nameHabit: String){
        val habit: Habit? = useCase.getHabitByName(nameHabit)
        if (habit !== null){
            useCase.removeHabit(habit)
        }
    }
}

data class Filters(
    var name: String?,
    var description: String?,
    var type: TypeHabit?,
    var priority: PriorityHabit?
){}

fun MutableSet<Habit>.filterByType(valueFilter: TypeHabit): MutableSet<Habit> {
    val filteredAllHabits: MutableSet<Habit> = this.filter{
        it.type == valueFilter
    }.toMutableSet()
    return filteredAllHabits
}

fun MutableSet<Habit>.filterByName(valueFilter: String): MutableSet<Habit> {
    val filteredAllHabits: MutableSet<Habit> = this.filter{
        it.name.contains(valueFilter)
    }.toMutableSet()
    return filteredAllHabits
}

fun MutableSet<Habit>.filterByDescription(valueFilter: String): MutableSet<Habit> {
    val filteredAllHabits: MutableSet<Habit> = this.filter{
        it.description.contains(valueFilter)
    }.toMutableSet()
    return filteredAllHabits
}

fun MutableSet<Habit>.filterByPriority(valueFilter: PriorityHabit): MutableSet<Habit> {
    val filteredAllHabits: MutableSet<Habit> = this.filter{
        it.priority == valueFilter
    }.toMutableSet()
    return filteredAllHabits
}