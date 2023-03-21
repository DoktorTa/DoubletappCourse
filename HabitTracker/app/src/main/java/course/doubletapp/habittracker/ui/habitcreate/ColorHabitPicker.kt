package course.doubletapp.habittracker.ui.habitcreate

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.view.View
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.RadioGroup
import androidx.appcompat.widget.AppCompatRadioButton
import course.doubletapp.habittracker.R

import course.doubletapp.habittracker.util.dp

class ColorHabitPicker(
    private val context: Context,
    private val colorSelectedSquare: View
) {

    private val colors: List<Int> = (0 until 16).map{
        Color.HSVToColor(floatArrayOf(360f / 16f * (it + 1) - 360f / 16f / 2f, 0.9f, 1f))
    }

    var selectedColor: Int? = null

    fun generateGradient(): GradientDrawable {
        val colors = generateGradientArray()
        val gradientDrawable = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, colors)
        gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT

        return gradientDrawable
    }

    private fun generateGradientArray(): IntArray{
        return (0..360).step(60)
            .map { it.toFloat() }
            .map { floatArrayOf(it, 0.9f, 1f) }
            .map { Color.HSVToColor(it) }
            .toIntArray()
    }

    fun generateRadioGroup(radioGroup: RadioGroup){
        for (color in colors) {
            radioGroup.addView(generateRadioButton(color.toString()))
        }
    }

    private fun generateRadioButton(color: String): AppCompatRadioButton =
        AppCompatRadioButton(context).apply{

            setBackgroundResource(R.drawable.radio_selecter)
            buttonDrawable = null
//            layoutParams = GridLayoutL

            text = color
            textSize = 1F
            setTextColor(android.R.color.transparent.toInt())

            setOnClickListener{
                changeColorSelectedSquare(color.toInt())
            }
        }

    // TODO: Переделать с хардкор кода.
    private fun getLayoutParams(): LinearLayout.LayoutParams{
        val params = LinearLayout.LayoutParams(44.dp, 44.dp)
        params.topMargin = 14.dp
        params.bottomMargin = 14.dp
        params.marginEnd = 7.dp
        params.marginStart = 7.dp
        return params
    }

    fun changeColorSelectedSquare(idColor: Int){
        val background = ColorDrawable(idColor)
        selectedColor = idColor
        colorSelectedSquare.background = background
    }

}