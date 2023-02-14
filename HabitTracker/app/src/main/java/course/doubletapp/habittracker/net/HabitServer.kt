package course.doubletapp.habittracker.net

import android.os.Parcelable
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.db.HabitEntity
import kotlinx.parcelize.Parcelize

/*
done_dates	[integer]
 */

data class HabitServer(
    var done_dates: List<Int> = listOf(),
    var uid: String,
    var frequency: Int,
    var priority: Int,
    var date: Int,
    var type: Int,
    var title: String,
    var description: String,
    var count: Int,
    var color: Int
) {


    companion object {
        fun habitToHabitServer(habit: Habit) = HabitServer(
            color = habit.color,
            count = habit.countDay,
            description = habit.description,
            title = habit.name,
            type = habit.type.ordinal,
            priority = habit.priority.ordinal,
            date = habit.date,
            frequency = habit.period,
            uid = habit.id,
        )
    }

        fun toHabitEntity() = HabitEntity(
                name = title,
                description = description,
                priority = PriorityHabit.createByPriority(priority),
                color = color,
                countDay = count,
                type = TypeHabit.createByType(type),
                date = date,
                id = uid,
                period = frequency
            )

}