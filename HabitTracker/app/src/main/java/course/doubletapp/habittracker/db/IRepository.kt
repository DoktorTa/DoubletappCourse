package course.doubletapp.habittracker.db

import course.doubletapp.habittracker.data.Habit
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getAllHabit(): Flow<List<Habit>>

    fun getHabitByName(name: String): Habit?

    fun createHabit(habit: Habit)

    fun editHabit(habit: Habit)

    fun removeHabit(habit: Habit)
}