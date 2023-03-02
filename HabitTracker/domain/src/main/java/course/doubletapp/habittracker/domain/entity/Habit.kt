package course.doubletapp.habittracker.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Habit(
    var name: String,
    var description: String,
    var priority: PriorityHabit,
    var type: TypeHabit,
    var count: Int,
    var period: Int,
    var color: Int,

    var id: String,
    var date: Int,
    var doneDates: List<Int>
) : Parcelable {}

