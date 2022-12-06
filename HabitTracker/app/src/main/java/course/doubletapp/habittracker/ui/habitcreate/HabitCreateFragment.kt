package course.doubletapp.habittracker.ui.habitcreate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import course.doubletapp.habittracker.databinding.FragmentHabitCreateBinding

class HabitCreateFragment: Fragment() {

    private lateinit var binding: FragmentHabitCreateBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitCreateBinding.inflate(inflater)

        return binding.root
    }
}