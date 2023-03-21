package course.doubletapp.habittracker.ui.habitcreate

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatRadioButton
import course.doubletapp.habittracker.R

import course.doubletapp.habittracker.util.dp

class ColorPicker(
    private val context: Context,
    private val colorPickerView: View,
    private val colorSelectedSquare: View,
    private val aboutColorText: View
) {
    var selectedColor: Int? = null

    companion object {
        private const val SATURATION = 0.9f
        private const val BRIGHTNESS = 1f

        private const val COUNT_SQUARE = 16
    }
    private val colors: List<Int> = (0 until COUNT_SQUARE).map{
        Color.HSVToColor(floatArrayOf(
            360f / COUNT_SQUARE * (it + 1) - 360f / COUNT_SQUARE / 2f,
            SATURATION,
            BRIGHTNESS))
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
        backgroundHabitColor.colors = colors

        return backgroundHabitColor
    }

    private fun generateGradientArray(): IntArray{
        return (0..360).step(60)
            .map { it.toFloat() }
            .map { floatArrayOf(it, SATURATION, BRIGHTNESS) }
            .map { Color.HSVToColor(it) }
            .toIntArray()
    }

    private fun generateRadioGroup(radioGroup: RadioGroup){
        for (color in colors) {
            radioGroup.addView(generateRadioButton(color.toString()))
        }
    }

    private fun generateInfoBySelectedColor(){
        var intColor: String = "0"
        var hexColor: String = "0x0"
        var hsvColor: String = "(0 ,0, 0)"

        if (selectedColor != null) {
            intColor = selectedColor.toString()
            hexColor = Integer.toHexString(selectedColor!!).toString()
            hsvColor = getHSVText(selectedColor!!)
        }

        val info: String = context.getString(
            R.string.infoColor,
            intColor,
            hexColor,
            hsvColor
        )

        val editText = aboutColorText as TextView
        editText.text = info

    }

    private fun getHSVText(color: Int): String {
        val hsv = FloatArray(3)
        Color.colorToHSV(color, hsv)

        val hue = hsv[0].toInt()
        val sat = (hsv[1] * 100).toInt()
        val value = (hsv[2] * 100).toInt()

        return "($hue, $sat, $value)"
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

    fun changeColorSelectedSquare(idColor: Int){
        selectedColor = idColor
        val backgroundHabitColor: GradientDrawable =
            colorSelectedSquare.background as GradientDrawable
        backgroundHabitColor.setColor(idColor)
        generateInfoBySelectedColor()
    }

}