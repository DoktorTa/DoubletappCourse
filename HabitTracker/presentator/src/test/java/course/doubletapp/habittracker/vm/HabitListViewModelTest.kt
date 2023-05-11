package course.doubletapp.habittracker.vm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import junit.framework.TestCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.rules.TestRule
import org.mockito.Mockito
internal class HabitListViewModelTest {

    private lateinit var useCaseMock: HabitsUseCase
    private lateinit var habitListViewModel: HabitListViewModel

    private lateinit var habitGoodTest: Habit
    private lateinit var habitGoodTest1: Habit

    @Before
    fun setUp(){
        habitGoodTest = Habit(
            id = "1",
            name = "Test",
            description = "Description",
            priority = PriorityHabit.HARD,
            type = TypeHabit.GOOD,
            count = 3,
            period = 5,
            color = 0xffffff,
            date = 4,
            doneDates = listOf()
        )

        habitGoodTest1 = Habit(
            id = "1",
            name = "Test1",
            description = "Description1",
            priority = PriorityHabit.HARD,
            type = TypeHabit.GOOD,
            count = 3,
            period = 5,
            color = 0xffffff,
            date = 4,
            doneDates = listOf()
        )


        val habitBadTest = Habit(
            id = "1",
            name = "Test",
            description = "Description",
            priority = PriorityHabit.HARD,
            type = TypeHabit.BAD,
            count = 3,
            period = 5,
            color = 0xffffff,
            date = 4,
            doneDates = listOf()
        )

        val habitBadTest1 = Habit(
            id = "1",
            name = "Test1",
            description = "Description1",
            priority = PriorityHabit.MEDIUM,
            type = TypeHabit.BAD,
            count = 3,
            period = 5,
            color = 0xffffff,
            date = 4,
            doneDates = listOf()
        )

        useCaseMock = Mockito.mock(HabitsUseCase::class.java)
        Mockito.`when`(useCaseMock.habits).thenReturn(MutableLiveData(listOf(habitGoodTest, habitGoodTest1, habitBadTest, habitBadTest1)))

        habitListViewModel = HabitListViewModel(useCaseMock)

    }

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun applyFilters() {
        val typeHabit: TypeHabit = TypeHabit.GOOD
        val filters = Filters(null, null, typeHabit, null)
        val testAnswer = listOf(habitGoodTest, habitGoodTest1)

        val afterFiltrate = habitListViewModel.applyFilters(filters)

        Assertions.assertEquals(testAnswer, afterFiltrate)
    }


    @Test
    fun resetFilter() {
        val typeHabit: TypeHabit = TypeHabit.GOOD
        val filtersAfterReset = Filters(null, null, typeHabit, null)

        habitListViewModel.resetFilter(typeHabit)

        Assertions.assertEquals(filtersAfterReset, habitListViewModel.nowFilters.value)
    }
}
