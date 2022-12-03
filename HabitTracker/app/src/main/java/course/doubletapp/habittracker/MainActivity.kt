package course.doubletapp.habittracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import course.doubletapp.habittracker.databinding.HabitItemBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: HabitItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HabitItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}