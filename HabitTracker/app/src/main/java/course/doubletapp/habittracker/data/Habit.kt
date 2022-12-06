package course.doubletapp.habittracker.data

data class Habit(
    var name: String,
    var description: String,
    var priority: PriorityHabit,
    var type: TypeHabit,
    var countDay: Int,
    var period: Int
) {}

enum class TypeHabit(
    val type: String
){
    GOOD("good"),
    BAD("bad")
}

enum class PriorityHabit(
    val priority: String
){
    HARD("Hard"),
    MEDIUM("Medium"),
    LOW("Low")
}
