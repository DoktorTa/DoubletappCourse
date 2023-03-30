package course.doubletapp.habittracker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.os.Build
import android.util.Log
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.databinding.FragmentInfoBinding

class InfoFragment: Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater)
        binding.infoForUser.text = getAllInfoForUser()
        return binding.root
    }

    private fun getAllInfoForUser(): String{
        return requireContext().getString(
            R.string.info_app,
            Build.USER,
            Build.ID,
            Build.BOARD,
            Build.BRAND,
            Build.DEVICE,
            Build.BOOTLOADER,
            Build.DISPLAY,
            Build.FINGERPRINT,
            Build.HARDWARE,
            Build.HOST,
            Build.MANUFACTURER,
            Build.MODEL,
            Build.PRODUCT
        )
    }
}