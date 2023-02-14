package course.doubletapp.habittracker.db

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import kotlinx.parcelize.Parcelize

@Entity
data class HabitEntity (
    @PrimaryKey var name: String,
    var description: String,
    var priority: PriorityHabit,
    var type: TypeHabit,
    var countDay: Int,
    var period: Int,
    var color: Int,
    var id: String,
    var date: Int
) {
    companion object {
        fun fromHabit(habit: Habit): HabitEntity {
            return HabitEntity(
                id = habit.id,
                date = habit.date,
                countDay = habit.countDay,
                color = habit.color,
                period = habit.period,
                type = habit.type,
                priority = habit.priority,
                description = habit.description,
                name = habit.name
            )
        }
    }

    fun toHabit() = Habit (
        name = name,
        description = description,
        priority = priority,
        color = color,
        countDay = countDay,
        type = type,
        date = date,
        id = id,
        period = period
    )
}