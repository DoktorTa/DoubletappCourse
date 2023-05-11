package course.doubletapp.habittracker.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.uc.CompleteHabitText
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import kotlinx.coroutines.launch

class HabitListViewModel(
    val useCase: HabitsUseCase,
): ViewModel() {

    private var typeHabitsInPage: TypeHabit? = null
    var allHabits: LiveData<List<Habit>> = useCase.habits
    val infoText: MutableLiveData<Pair<Int, Int?>> = MutableLiveData(Pair(0, null))
    val nowFilters: MutableLiveData<Filters> = MutableLiveData(Filters(null, null, null, null))

    companion object {
        private const val EMPTY_LINE = ""
    }

    fun loadHabit() {
        viewModelScope.launch {
            useCase.loadHabitFromServer()
        }
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

        if (name != EMPTY_LINE) {
            f.name = name
        } else {
            f.name = null
        }

        nowFilters.value = f
    }

    fun searchByDescription(description: String){
        val f = nowFilters.value!!

        if (description != EMPTY_LINE) {
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
        viewModelScope.launch {
            val habit: Habit? = useCase.getHabitById(idHabit)
            if (habit !== null){
                useCase.removeHabit(habit)
            }
        }
    }

    fun completeHabit(idHabit: String) {
        viewModelScope.launch {
            val (textAnswer, argument) = useCase.completeHabit(idHabit)
            infoText.value = Pair(
                CompleteHabitTextUi.fromCompleteHabitText(textAnswer).resId,
                argument
            )
        }
    }
}

enum class CompleteHabitTextUi(val resId: Int){
    BAD_REMAINING(R.string.again_bad),
    BAD_MORE(R.string.more_bad),
    GOOD_MORE(R.string.more_good),
    GOOD_REMAINING(R.string.again_good),
    ERROR(R.string.default_text);

    companion object {
        fun fromCompleteHabitText(cht: CompleteHabitText): CompleteHabitTextUi {
            return when(cht) {
                CompleteHabitText.BAD_MORE -> BAD_MORE
                CompleteHabitText.BAD_REMAINING -> BAD_REMAINING
                CompleteHabitText.GOOD_MORE -> GOOD_MORE
                CompleteHabitText.GOOD_REMAINING -> GOOD_REMAINING
                CompleteHabitText.ERROR -> ERROR
            }
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