package course.doubletapp.habittracker.domain.entity


enum class PriorityHabit(){
    HARD(),
    MEDIUM(),
    LOW();

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