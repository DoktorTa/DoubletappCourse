package course.doubletapp.habittracker.data

import course.doubletapp.habittracker.R

enum class PriorityHabit(val resID: Int){
    HARD(R.string.hardText),
    MEDIUM(R.string.mediumText),
    LOW(R.string.lowText);

    companion object {
        fun createByPriority(ordinal: Int): PriorityHabit {
            return when (ordinal) {
                1 -> MEDIUM
                2 -> LOW
                else -> HARD
            }
        }
    }
}