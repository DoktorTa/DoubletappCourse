package course.doubletapp.habittracker.data.network.data

import course.doubletapp.habittracker.domain.entity.Habit

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

        fun toHabitEntity() = course.doubletapp.habittracker.data.db.HabitEntity(
            name = title,
            description = description,
            priority = priority,
            color = color,
            countDay = count,
            type = type,
            date = date,
            id = uid,
            period = frequency
        )

}