package course.doubletapp.habittracker.domain.repository

import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.ApiResponse
import course.doubletapp.habittracker.domain.entity.HabitUid
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getAllHabit(): Flow<List<Habit>>

    suspend fun loadHabitFromServer() : ApiResponse<Unit>

    fun getHabitByName(name: String): Habit?

    suspend fun createHabit(habit: Habit): ApiResponse<HabitUid>

    fun editHabit(habit: Habit)

    suspend fun removeHabit(habit: Habit)  : ApiResponse<Unit>
}