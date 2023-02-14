package course.doubletapp.habittracker.data

import course.doubletapp.habittracker.R

enum class TypeHabit(val resId: Int){
    GOOD(R.string.goodText),
    BAD(R.string.badText);

    companion object {
        fun createByType(ordinal: Int): TypeHabit {
            return when (ordinal) {
                1 -> BAD
                else -> GOOD
            }
        }
    }
}