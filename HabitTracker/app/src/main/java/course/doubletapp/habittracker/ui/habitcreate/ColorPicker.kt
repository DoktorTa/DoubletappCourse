package course.doubletapp.habittracker.ui.habitcreate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import androidx.core.view.marginBottom
import course.doubletapp.habittracker.databinding.ColorItemBinding


class ColorPicker(
    context: Context
): ScrollView(context) {

    private val colors: List<Int> = listOf()
    private var selectedColor: Int = 0

    fun createOneColorSquare(color: Int): RadioButton{
        val radioButton: RadioButton = RadioButton(context)
        val binding: ColorItemBinding = ColorItemBinding.inflate(LayoutInflater.from(context))
        return radioButton
    }

    fun generateColorPalette(){
        val radioGroup: RadioGroup = RadioGroup(context)
        radioGroup.orientation = RadioGroup.HORIZONTAL

        for (color in colors) {

            radioGroup.addView(createOneColorSquare(color))

        }

    }

}