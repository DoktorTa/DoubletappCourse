package course.doubletapp.habittracker.ui.infoOnApp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import course.doubletapp.habittracker.databinding.FragmentInfoOnAppBinding

class InfoOnAppFragment: Fragment() {

    private lateinit var binding: FragmentInfoOnAppBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInfoOnAppBinding.inflate(inflater)
        
        return binding.root
    }
}