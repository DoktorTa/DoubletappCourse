package course.doubletapp.habittracker

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import course.doubletapp.habittracker.uc.HabitsUseCase


class HabitTrackerApplication: Application() {

    lateinit var mInstance: HabitTrackerApplication

    val ticketUseCase by lazy {HabitsUseCase()}

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        mInstance = this
    }

}