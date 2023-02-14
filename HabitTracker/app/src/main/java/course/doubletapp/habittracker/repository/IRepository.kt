package course.doubletapp.habittracker.repository

import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.db.HabitEntity
import course.doubletapp.habittracker.net.ApiResponse
import course.doubletapp.habittracker.net.HabitUid
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getAllHabit(): Flow<List<HabitEntity>>

    fun getHabitByName(name: String): Habit?

    suspend fun createHabit(habit: Habit): ApiResponse<HabitUid>

    fun editHabit(habit: Habit)

    suspend fun removeHabit(habit: Habit)  : ApiResponse<Unit>

    suspend fun loadHabitFromServer() : ApiResponse<Unit>
}