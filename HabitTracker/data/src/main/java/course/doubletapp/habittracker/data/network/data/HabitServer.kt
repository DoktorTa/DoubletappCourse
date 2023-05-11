package course.doubletapp.habittracker.data.network.data

import course.doubletapp.habittracker.data.db.HabitEntity
import course.doubletapp.habittracker.domain.entity.Habit

data class HabitServer(
    var done_dates: List<Int>,
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
            count = habit.count,
            description = habit.description,
            title = habit.name,
            type = habit.type.ordinal,
            priority = habit.priority.ordinal,
            date = habit.date,
            frequency = habit.period,
            uid = habit.id,
            done_dates = habit.doneDates
        )
    }

        fun toHabitEntity() = HabitEntity(
            name = title,
            description = description,
            priority = priority,
            color = color,
            count = count,
            type = type,
            date = date,
            id = uid,
            period = frequency,
            doneDates = done_dates
        )

}