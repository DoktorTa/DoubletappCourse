package course.doubletapp.habittracker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.os.Build
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
        return "User: ${Build.USER}\n" +
                "Id: ${Build.ID}\n" +
                "Board: ${Build.BOARD}\n" +
                "Brand: ${Build.BRAND}\n" +
                "Device: ${Build.DEVICE}\n" +
                "Bootloader: ${Build.BOOTLOADER}\n" +
                "Display: ${Build.DISPLAY}\n" +
                "Fingerprint: ${Build.FINGERPRINT}\n" +
                "Hardware: ${Build.HARDWARE}\n" +
                "Host: ${Build.HOST}\n" +
                "Manufacturer: ${Build.MANUFACTURER}\n" +
                "Model: ${Build.MODEL}\n" +
                "Product: ${Build.PRODUCT}\n"
    }
}