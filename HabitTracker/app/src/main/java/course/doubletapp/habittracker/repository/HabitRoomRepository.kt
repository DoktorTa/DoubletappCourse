package course.doubletapp.habittracker.repository

import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.db.HabitDao
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
//
//class HabitRoomRepository(
//    private val habitDao: HabitDao
//): IRepository {
//
//
//    override fun getAllHabit(): Flow<List<Habit>> {
//        return habitDao.getAllHabits()
//    }
//
//    override fun getHabitByName(name: String): Habit? {
//        return habitDao.getHabitByName(name)
//    }
//
//    @OptIn(DelicateCoroutinesApi::class)
//    override fun createHabit(habit: Habit) {
//        GlobalScope.launch(Dispatchers.IO) {
//            habitDao.createHabit(habit)
//        }
//    }
//
//    @OptIn(DelicateCoroutinesApi::class)
//    override fun editHabit(habit: Habit) {
//        GlobalScope.launch(Dispatchers.IO) {
//            habitDao.editHabit(habit)
//        }
//    }
//
//    @OptIn(DelicateCoroutinesApi::class)
//    override fun removeHabit(habit: Habit) {
//        GlobalScope.launch(Dispatchers.IO) {
//            habitDao.removeHabit(habit)
//        }
//    }
//
//}