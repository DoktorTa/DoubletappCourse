package course.doubletapp.habittracker.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Habit(
    var name: String,
    var description: String,
    var priority: PriorityHabit,
    var type: TypeHabit,
    var countDay: Int,
    var period: Int,
    var color: Int
) : Parcelable {}

enum class TypeHabit{
    GOOD,
    BAD
}

enum class PriorityHabit{
    HARD,
    MEDIUM,
    LOW
}
