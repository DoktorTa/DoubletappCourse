package course.doubletapp.habittracker.repository

import android.util.Log
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.db.HabitDao
import course.doubletapp.habittracker.db.HabitEntity
import course.doubletapp.habittracker.net.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

class HabitServerRepository(private val habitsDao: HabitDao): IRepository {
    override fun getAllHabit(): Flow<List<HabitEntity>> {
        return habitsDao.getAllHabits()
    }

    override suspend fun loadHabitFromServer() : ApiResponse<Unit> {
        return try {
            val response = retryRequest { NetworkClient.habitAPI.getHabits() }
            response.forEach{
                updateHabitInLocalDatabase(it.toHabitEntity())
            }
            ApiResponse.Success(data = Unit)
        } catch (e: RuntimeException) {
            ApiResponse.Error(e)
        }
    }

    private suspend fun updateHabitInLocalDatabase(habit: HabitEntity){
        val habitFromDateBase = habitsDao.getHabitById(habit.id)
        if (habitFromDateBase != null) {
            if (habitFromDateBase.date < habit.date){
                habitsDao.editHabit(habit)
            }
        } else {
            habitsDao.createHabit(habit)
        }
    }

    override fun getHabitByName(name: String): Habit? {
        return null
        TODO("Not yet implemented")
    }

    override suspend fun createHabit(habit: Habit): ApiResponse<HabitUid> {
        return try {
            val response = retryRequest {
                NetworkClient.habitAPI.saveHabit(HabitServer.habitToHabitServer(habit)) }

            val apiResponse = ApiResponse.Success(HabitUid(response.uid))

            habit.id = apiResponse.data.uid
            updateHabitInLocalDatabase(habit.toHabitEntity())
            return apiResponse

        } catch (e: java.lang.RuntimeException) {
            ApiResponse.Error(e)
        }
    }

    override fun editHabit(habit: Habit) {
        TODO("Not yet implemented")
    }

    override suspend fun removeHabit(habit: Habit) : ApiResponse<Unit>{
        return try {
            retryRequest { NetworkClient.habitAPI.removeHabit(HabitUid(habit.id)) }
            habitsDao.removeHabit(HabitEntity.fromHabit(habit))
            ApiResponse.Success(data = Unit)
        } catch (e: java.lang.RuntimeException) {
            ApiResponse.Error(e)
        }
    }

}