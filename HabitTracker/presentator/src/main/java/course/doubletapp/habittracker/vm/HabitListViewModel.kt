package course.doubletapp.habittracker.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import javax.inject.Inject

class HabitListViewModel(
    val useCase: HabitsUseCase,
): ViewModel() {

    private var typeHabitsInPage: TypeHabit? = null
    var allHabits: LiveData<List<Habit>> = useCase.habits
    var serverStatus: LiveData<String> = MutableLiveData("")
    val nowFilters: MutableLiveData<Filters> = MutableLiveData(Filters(null, null, null, null))

    fun loadHabit() {
        useCase.loadHabitFromServer()
    }

    fun applyFilters(filters: Filters): MutableList<Habit>?{
        if (allHabits.value == null) {
            return null
        }

        val filteredObject: MutableSet<Habit> = allHabits.value!!.toMutableSet()

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

    fun removeHabit(idHabit: String){
        val habit: Habit? = useCase.getHabitById(idHabit)
        if (habit !== null){
            useCase.removeHabit(habit)
        }
    }

    fun completeHabit(idHabit: String): String {
        val habit: Habit = useCase.getHabitById(idHabit)!!

        useCase.completeHabit(habit)
        val remainingExec = useCase.getNumberRemainingExecutions(habit)
        if (habit.type == TypeHabit.BAD){
            if (remainingExec > 0) {
                return "Можно сделать еще $remainingExec раз."
            } else {
                return "Больше нельзя."
            }

        } else if (habit.type == TypeHabit.GOOD){
            if (remainingExec > 0){
                return "Еще раз $remainingExec надо."
            } else {
                return "Братан, хорош, давай, давай, вперёд! Привычка в кайф, можно еще! Вообще красавчик! Можно вот этого вот почаще?"
            }
        }

        return "ERROR"
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