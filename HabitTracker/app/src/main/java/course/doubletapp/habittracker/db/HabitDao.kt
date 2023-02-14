package course.doubletapp.habittracker.db

import androidx.room.*
import course.doubletapp.habittracker.data.Habit
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {
    @Query("SELECT * FROM HabitEntity")
    fun getAllHabits(): Flow<List<HabitEntity>>

    @Query("SELECT * FROM HabitEntity WHERE id = :id")
    fun getHabitById(id: String): HabitEntity?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun createHabit(habit: HabitEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editHabit(habit: HabitEntity)

    @Delete
    suspend fun removeHabit(habit: HabitEntity)
}