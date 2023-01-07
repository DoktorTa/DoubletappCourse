package course.doubletapp.habittracker.data

import android.os.Parcelable
import course.doubletapp.habittracker.R
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

enum class TypeHabit(val resId: Int){
    GOOD(R.string.goodText),
    BAD(R.string.badText)
}

enum class PriorityHabit(val resID: Int){
    HARD(R.string.hardText),
    MEDIUM(R.string.mediumText),
    LOW(R.string.lowText)
}
