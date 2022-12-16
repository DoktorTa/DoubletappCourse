package course.doubletapp.habittracker.ui

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.databinding.ActivityCentralBinding

class CentralActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCentralBinding
    private lateinit var appBar: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCentralBinding.inflate(layoutInflater)

        appBar = ActionBarDrawerToggle(
            this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer)
        binding.drawerLayout.addDrawerListener(appBar)
        setContentView(binding.root)

    }

}