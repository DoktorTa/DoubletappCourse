package course.doubletapp.habittracker.db

import androidx.room.*
import course.doubletapp.habittracker.data.Habit
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {
    @Query("SELECT * FROM Habit")
    fun getAllHabits(): Flow<List<Habit>>

    @Query("SELECT * FROM Habit WHERE name = :habitName")
    fun getHabitByName(habitName: String): Habit?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun createHabit(habit: Habit)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editHabit(habit: Habit)

    @Delete
    suspend fun removeHabit(habit: Habit)
}