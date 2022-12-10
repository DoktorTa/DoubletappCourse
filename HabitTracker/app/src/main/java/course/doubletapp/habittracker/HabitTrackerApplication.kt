package course.doubletapp.habittracker

import android.app.Application
import course.doubletapp.habittracker.uc.HabitsUseCase


class HabitTrackerApplication: Application() {

    lateinit var mInstance: HabitTrackerApplication

    val ticketUseCase by lazy {HabitsUseCase()}

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }

}