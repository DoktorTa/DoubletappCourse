package course.doubletapp.habittracker.db

import androidx.lifecycle.LiveData
import course.doubletapp.habittracker.data.Habit
import kotlinx.coroutines.flow.Flow

class HabitRepository(
    private val habitDao: HabitDao
): IRepository {


    override fun getAllHabit(): Flow<List<Habit>> {
        return habitDao.getAllHabits()
    }

    override fun getHabitByName(name: String): Habit? {
        return habitDao.getHabitByName(name)
    }

    override fun createHabit(habit: Habit) {
        return habitDao.createHabit(habit)
    }

    override fun editHabit(habit: Habit) {
        return habitDao.editHabit(habit)
    }

    override fun removeHabit(habit: Habit) {
        return habitDao.removeHabit(habit)
    }

}