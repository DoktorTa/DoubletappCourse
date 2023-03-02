package course.doubletapp.habittracker.data.repository

import android.util.Log
import course.doubletapp.habittracker.data.db.HabitDao
import course.doubletapp.habittracker.data.db.HabitEntity
import course.doubletapp.habittracker.domain.repository.IRepository
import course.doubletapp.habittracker.data.network.*
import course.doubletapp.habittracker.data.network.data.HabitDoneServer
import course.doubletapp.habittracker.data.network.data.HabitServer
import course.doubletapp.habittracker.data.network.data.HabitUidServer
import course.doubletapp.habittracker.domain.ApiResponse
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.HabitUid
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class HabitServerRepository @Inject constructor(
    private val habitsDao: HabitDao,
    private val habitServerAPI: HabitServerAPI
): IRepository {

    override fun getAllHabit(): Flow<List<Habit>> {
        return habitsDao.getAllHabits().map { it.map { it.toHabit() } }
    }

    override suspend fun loadHabitFromServer() : ApiResponse<Unit> {
        return try {
            val response = retryRequest { habitServerAPI.getHabits() }
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

    override fun getHabitById(id: String): Habit? {
        return habitsDao.getHabitById(id)?.toHabit()
    }

    override suspend fun createHabit(habit: Habit): ApiResponse<HabitUid> {
        return try {
            val response = retryRequest {
                habitServerAPI.saveHabit(HabitServer.habitToHabitServer(habit))
            }

            val apiResponse = ApiResponse.Success(HabitUid(response.uid))

            habit.id = apiResponse.data.uid
            updateHabitInLocalDatabase(HabitEntity.fromHabit(habit))
            return apiResponse

        } catch (e: RuntimeException) {
            ApiResponse.Error(e)
        }
    }

    override suspend fun editHabit(habit: Habit): ApiResponse<HabitUid> {
        return createHabit(habit)
    }

    override suspend fun removeHabit(habit: Habit) : ApiResponse<Unit>{
        return try {
            retryRequest { habitServerAPI.removeHabit(HabitUidServer(habit.id)) }
            habitsDao.removeHabit(HabitEntity.fromHabit(habit))
            ApiResponse.Success(data = Unit)
        } catch (e: RuntimeException) {
            ApiResponse.Error(e)
        }
    }

    override suspend fun doneHabit(habit: Habit): ApiResponse<Unit> {
        return try {
            Log.d("HABITSERVERREPOSITORY", "111111111111111111111 ${habit.id}, ${habit.doneDates.last()}")
            retryRequest { habitServerAPI.doneHabit(HabitDoneServer(habit.doneDates.last(), habit.id)) }
            habitsDao.editHabit(HabitEntity.fromHabit(habit))
            ApiResponse.Success(data = Unit)
        } catch (e: RuntimeException) {
            ApiResponse.Error(e)
        }
    }
}