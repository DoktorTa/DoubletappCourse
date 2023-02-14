package course.doubletapp.habittracker.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.uc.HabitsUseCase

class HabitListViewModel(
    val useCase: course.doubletapp.habittracker.domain.uc.HabitsUseCase,
//    private val typeHabitsInPage: TypeHabit
): ViewModel() {

    private var typeHabitsInPage: course.doubletapp.habittracker.domain.entity.TypeHabit? = null
    var allHabits: LiveData<List<course.doubletapp.habittracker.domain.entity.Habit>> = useCase.habits
    var serverStatus: LiveData<String> = MutableLiveData("")
    val nowFilters: MutableLiveData<Filters> = MutableLiveData(Filters(null, null, null, null))

    fun loadHabit() {
        useCase.loadHabitFromServer()
    }

    fun applyFilters(filters: Filters): MutableList<course.doubletapp.habittracker.domain.entity.Habit>?{
        if (allHabits.value == null) {
            return null
        }

        val filteredObject: MutableSet<course.doubletapp.habittracker.domain.entity.Habit> = allHabits.value!!.toMutableSet()

        var filtrateObjects: Set<course.doubletapp.habittracker.domain.entity.Habit> = setOf()

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

        return filtrateObjects.toMutableList()
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

    fun searchByPriority(priority: course.doubletapp.habittracker.domain.entity.PriorityHabit?){
        val f = nowFilters.value!!

        if (priority != null) {
            f.priority = priority
        } else {
            f.priority = null
        }

        nowFilters.value = f
    }

    fun resetFilter(typeHabits: course.doubletapp.habittracker.domain.entity.TypeHabit? = typeHabitsInPage){
        typeHabitsInPage = typeHabits
        nowFilters.value = Filters(null, null, typeHabitsInPage, null)
    }

    fun removeHabit(nameHabit: String){
        val habit: course.doubletapp.habittracker.domain.entity.Habit? = useCase.getHabitByName(nameHabit)
        if (habit !== null){
            useCase.removeHabit(habit)
        }
    }
}

data class Filters(
    var name: String?,
    var description: String?,
    var type: course.doubletapp.habittracker.domain.entity.TypeHabit?,
    var priority: course.doubletapp.habittracker.domain.entity.PriorityHabit?
){}

fun MutableSet<course.doubletapp.habittracker.domain.entity.Habit>.filterByType(valueFilter: course.doubletapp.habittracker.domain.entity.TypeHabit): MutableSet<course.doubletapp.habittracker.domain.entity.Habit> {
    val filteredAllHabits: MutableSet<course.doubletapp.habittracker.domain.entity.Habit> = this.filter{
        it.type == valueFilter
    }.toMutableSet()
    return filteredAllHabits
}

fun MutableSet<course.doubletapp.habittracker.domain.entity.Habit>.filterByName(valueFilter: String): MutableSet<course.doubletapp.habittracker.domain.entity.Habit> {
    val filteredAllHabits: MutableSet<course.doubletapp.habittracker.domain.entity.Habit> = this.filter{
        it.name.contains(valueFilter)
    }.toMutableSet()
    return filteredAllHabits
}

fun MutableSet<course.doubletapp.habittracker.domain.entity.Habit>.filterByDescription(valueFilter: String): MutableSet<course.doubletapp.habittracker.domain.entity.Habit> {
    val filteredAllHabits: MutableSet<course.doubletapp.habittracker.domain.entity.Habit> = this.filter{
        it.description.contains(valueFilter)
    }.toMutableSet()
    return filteredAllHabits
}

fun MutableSet<course.doubletapp.habittracker.domain.entity.Habit>.filterByPriority(valueFilter: course.doubletapp.habittracker.domain.entity.PriorityHabit): MutableSet<course.doubletapp.habittracker.domain.entity.Habit> {
    val filteredAllHabits: MutableSet<course.doubletapp.habittracker.domain.entity.Habit> = this.filter{
        it.priority == valueFilter
    }.toMutableSet()
    return filteredAllHabits
}