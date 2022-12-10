package course.doubletapp.habittracker

import android.app.Application
import course.doubletapp.habittracker.uc.HabitsUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class HabitTrackerApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    lateinit var mInstance: HabitTrackerApplication

    val ticketUseCase by lazy {HabitsUseCase()}

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }

}