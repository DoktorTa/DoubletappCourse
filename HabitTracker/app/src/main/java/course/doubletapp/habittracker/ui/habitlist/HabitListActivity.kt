package course.doubletapp.habittracker.ui.habitlist

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.databinding.ActivityHabitListBinding
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListActivity: AppCompatActivity() {

    private lateinit var binding: ActivityHabitListBinding

//    private lateinit var navController: NavController


    private lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit_list)

        binding = ActivityHabitListBinding.inflate(layoutInflater)
//        navController = binding.navHostFragment.getFragment<NavHostFragment>().navController

        drawerToggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer)
        binding.drawerLayout.addDrawerListener(drawerToggle)

//        setupDrawerLayout()
    }

}