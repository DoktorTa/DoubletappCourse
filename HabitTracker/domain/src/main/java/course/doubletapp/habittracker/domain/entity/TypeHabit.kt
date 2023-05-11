package course.doubletapp.habittracker.domain.entity

enum class TypeHabit(){
    GOOD(),
    BAD();

    companion object {
        fun createByType(ordinal: Int): TypeHabit {
            return when (ordinal) {
                1 -> BAD
                else -> GOOD
            }
        }
    }
}