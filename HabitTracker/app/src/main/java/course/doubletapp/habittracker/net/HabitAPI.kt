package course.doubletapp.habittracker.net

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.PUT

interface HabitAPI {

    @GET("habit")
    suspend fun getHabits(): List<HabitServer>

    @PUT("habit")
    suspend fun saveHabit(@Body habitDTO: HabitServer): HabitUidServer

    @HTTP(method = "DELETE", path = "habit", hasBody = true)
    suspend fun removeHabit(@Body habitUid: HabitUid)
}