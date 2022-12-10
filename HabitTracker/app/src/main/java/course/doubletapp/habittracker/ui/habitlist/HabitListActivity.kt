package course.doubletapp.habittracker.ui.habitlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit_list)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentHabitList, HabitListFragment()).commit()
    }

}