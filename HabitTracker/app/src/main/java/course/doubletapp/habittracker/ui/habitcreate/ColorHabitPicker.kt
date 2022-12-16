package course.doubletapp.habittracker.ui.habitcreate

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioGroup
import androidx.appcompat.widget.AppCompatRadioButton
import course.doubletapp.habittracker.R

import course.doubletapp.habittracker.util.dp

class ColorPicker(
    private val context: Context,
    private val colorPickerView: View,
    private val colorSelectedSquare: View
) {
    var selectedColor: Int? = null
    private val colors: List<Int> = (0 until 16).map{
        Color.HSVToColor(floatArrayOf(360f / 16f * (it + 1) - 360f / 16f / 2f, 0.9f, 1f))
    }

    init {
        generateGradient()
        generateRadioGroup(colorPickerView as RadioGroup)
    }

    private fun generateGradient(): GradientDrawable {
        val colors = generateGradientArray()

        val backgroundHabitColor: GradientDrawable =
            colorPickerView.background as GradientDrawable

        backgroundHabitColor.gradientType = GradientDrawable.LINEAR_GRADIENT
        backgroundHabitColor.orientation = GradientDrawable.Orientation.LEFT_RIGHT
        backgroundHabitColor.setColors(colors)

        return backgroundHabitColor
    }

    private fun generateGradientArray(): IntArray{
        return (0..360).step(60)
            .map { it.toFloat() }
            .map { floatArrayOf(it, 0.9f, 1f) }
            .map { Color.HSVToColor(it) }
            .toIntArray()
    }

    private fun generateRadioGroup(radioGroup: RadioGroup){
        for (color in colors) {
            radioGroup.addView(generateRadioButton(color.toString()))
        }
    }

    private fun generateRadioButton(color: String): AppCompatRadioButton{
        val radioButton = AppCompatRadioButton(context)
        radioButton.setBackgroundResource(R.drawable.radio_selecter)
        radioButton.buttonDrawable = null
        radioButton.layoutParams = getLayoutParams()

        radioButton.text = color
        radioButton.textSize = 1F
        radioButton.setTextColor(android.R.color.transparent.toInt())

        radioButton.setOnClickListener{
                changeColorSelectedSquare(color.toInt())
        }
        return radioButton
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

    private fun changeColorSelectedSquare(idColor: Int){
        val backgroundHabitColor: GradientDrawable =
            colorSelectedSquare.background as GradientDrawable
        backgroundHabitColor.setColor(idColor)
    }

}