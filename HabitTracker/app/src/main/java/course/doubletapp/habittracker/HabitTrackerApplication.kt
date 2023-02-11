package course.doubletapp.habittracker

import android.app.Application
import course.doubletapp.habittracker.db.HabitDataBase
import course.doubletapp.habittracker.db.HabitRepository
import course.doubletapp.habittracker.uc.HabitsUseCase


class HabitTrackerApplication: Application() {

    val dataBase by lazy { HabitDataBase.getInstance(this) }
    val repository by lazy { HabitRepository(dataBase.habitDao()) }
    val habitsUseCase by lazy {HabitsUseCase(repository)}

    lateinit var mInstance: HabitTrackerApplication

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }

}