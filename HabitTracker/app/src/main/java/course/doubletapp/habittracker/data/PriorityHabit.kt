package course.doubletapp.habittracker.data

import course.doubletapp.habittracker.R

enum class PriorityHabit(val resID: Int){
    HARD(R.string.hardText),
    MEDIUM(R.string.mediumText),
    LOW(R.string.lowText)
}