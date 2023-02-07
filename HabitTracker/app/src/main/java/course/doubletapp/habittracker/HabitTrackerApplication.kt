package course.doubletapp.habittracker

import android.app.Application
import course.doubletapp.habittracker.db.HabitDataBase
import course.doubletapp.habittracker.db.HabitRepository
import course.doubletapp.habittracker.uc.HabitsUseCase


class HabitTrackerApplication: Application() {

    val dataBase by lazy { HabitDataBase.getInstance(this) }
    val repository by lazy { HabitRepository(dataBase.habitDao()) }

    lateinit var mInstance: HabitTrackerApplication

    val habitsUseCase by lazy {HabitsUseCase(repository)}

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }

}