package course.doubletapp.habittracker.ui.habitlist

import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.ui.habitcreate.HabitCreateFragment
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit_list)

        val habitUseCase = (application as HabitTrackerApplication).ticketUseCase
        val habitListViewModel = HabitListViewModel(habitUseCase)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentHabitList, HabitListFragment(habitListViewModel)).commit()
    }
}