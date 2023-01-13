package course.doubletapp.habittracker.ui.habitlist

import android.view.View

interface HabitClickListener {
    fun habitClickListener(view: View, name: String)
}