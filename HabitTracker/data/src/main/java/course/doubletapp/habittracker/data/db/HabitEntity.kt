package course.doubletapp.habittracker.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit

@Entity
data class HabitEntity (
    @PrimaryKey var name: String,
    var description: String,
    var priority: Int,
    var type: Int,
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
                type = habit.type.ordinal,
                priority = habit.priority.ordinal,
                description = habit.description,
                name = habit.name
            )
        }
    }

    fun toHabit() = Habit (
        name = name,
        description = description,
        priority = PriorityHabit.createByPriority(priority),
        color = color,
        countDay = countDay,
        type = TypeHabit.createByType(type),
        date = date,
        id = id,
        period = period
    )
}