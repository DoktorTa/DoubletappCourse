package course.doubletapp.habittracker.ui.habitcreate

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.vm.HabitCreateViewModel

class HabitCreateActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit_create)

        val habitUseCase = (application as HabitTrackerApplication).ticketUseCase
        val habitCreateViewModel = HabitCreateViewModel(habitUseCase)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentHabitCreate, HabitCreateFragment(habitCreateViewModel))
            .commit()
    }
}