package course.doubletapp.habittracker.data.network

import course.doubletapp.habittracker.data.network.data.HabitDoneServer
import course.doubletapp.habittracker.data.network.data.HabitServer
import course.doubletapp.habittracker.data.network.data.HabitUidServer
import retrofit2.http.*

interface HabitServerAPI {

    @GET("habit")
    suspend fun getHabits(): List<HabitServer>

    @POST("habit_done")
    suspend fun doneHabit(@Body habitDoneDTO: HabitDoneServer)

    @PUT("habit")
    suspend fun saveHabit(@Body habitDTO: HabitServer): HabitUidServer

    @HTTP(method = "DELETE", path = "habit", hasBody = true)
    suspend fun removeHabit(@Body habitUid: HabitUidServer)
}