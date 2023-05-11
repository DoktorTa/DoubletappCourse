package course.doubletapp.habittracker

import android.app.Application
import android.content.Context
import course.doubletapp.habittracker.di.AppComponent
import course.doubletapp.habittracker.di.DaggerAppComponent


class HabitTrackerApplication: Application() {

    lateinit var appComponent: AppComponent
        private set

    companion object {
        var mInstance: HabitTrackerApplication? = null

        fun getInstance(): HabitTrackerApplication? = mInstance

        fun getContext(): Context? = mInstance?.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .context(context = this)
            .build()

        mInstance = this
    }
}