package course.doubletapp.habittracker.ui.habitcreate

import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.core.view.marginStart
import androidx.fragment.app.Fragment
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.databinding.FragmentHabitCreateBinding


class HabitCreateFragment: Fragment() {

    private lateinit var binding: FragmentHabitCreateBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitCreateBinding.inflate(inflater)

        if (isAdded) {
            binding.colorSquare.background = generateGradient()
            generateRadioButton()
            binding.okButton.setOnClickListener { view -> toastColorSelect(view) }
        }
        return binding.root
    }


    private fun generateRadioButton(){
        val radioGroup = binding.colorSquare
        Log.d("HabitCreateFragment", colors.toString())
        for (color in colors) {
            val radioButton = AppCompatRadioButton(context)
            radioButton.setBackgroundResource(R.drawable.radio_selecter)
            radioButton.buttonDrawable = null


//            val params = LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//            )

            val params = LinearLayout.LayoutParams(50.dp, 50.dp)

            params.leftMargin = 10.dp
            params.topMargin = 10.dp
            params.bottomMargin = 10.dp
            radioButton.layoutParams = params

            radioButton.text = color.toString()
            radioButton.textSize = 1F
            radioButton.setTextColor(android.R.color.transparent.toInt())


            radioGroup.addView(radioButton)
        }
    }

    private fun toastColorSelect(view: View){
        val idButtonSelected: Int = binding.colorSquare.checkedRadioButtonId
        val text = binding.colorSquare.findViewById<AppCompatRadioButton>(idButtonSelected).text.toString()
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(requireContext(), text, duration)
        toast.show()
    }

    val Int.dp: Int
        get() = (this * Resources.getSystem().displayMetrics.density + 0.5f).toInt()

    private val colors: List<Int> = (0 until 16).map{
        Color.HSVToColor(floatArrayOf(360f / 16f * (it + 1) - 360f / 16f / 2f, 0.9f, 1f))
    }

    private fun generateGradient(): GradientDrawable{
        val colors = (0..360).step(60)
            .map { it.toFloat() }
            .map { floatArrayOf(it, 0.9f, 1f) }
            .map { Color.HSVToColor(it) }
            .toIntArray()
        val gradientDrawable = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, colors)
        gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT

        return gradientDrawable
    }
}