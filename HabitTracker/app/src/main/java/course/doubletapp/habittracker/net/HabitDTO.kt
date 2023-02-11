package course.doubletapp.habittracker.net

import android.os.Parcelable
import androidx.room.PrimaryKey
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import kotlinx.parcelize.Parcelize

@Parcelize
data class HabitDTO(
    @PrimaryKey var name: String,
    var description: String,
    var priority: PriorityHabit,
    var type: TypeHabit,
    var countDay: Int,
    var period: Int,
    var color: Int
) : Parcelable {


    companion object {
        fun habitToHabitServer(habit: Habit){

        }


    }

}