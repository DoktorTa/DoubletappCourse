package course.doubletapp.habittracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import course.doubletapp.habittracker.databinding.HabitItemBinding
import course.doubletapp.habittracker.ui.habitcreate.HabitCreateFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentHabitCreate, HabitCreateFragment()).commit()
    }
}