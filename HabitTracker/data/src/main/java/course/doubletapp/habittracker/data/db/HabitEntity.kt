package course.doubletapp.habittracker.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit

@Entity
@TypeConverters(HabitTypeConverter::class)
data class HabitEntity (
    @PrimaryKey var name: String,
    var description: String,
    var priority: Int,
    var type: Int,
    var count: Int,
    var period: Int,
    var color: Int,
    var id: String,
    var date: Int,
    var doneDates: List<Int>
    ) {
    companion object {
        fun fromHabit(habit: Habit): HabitEntity {
            return HabitEntity(
                id = habit.id,
                date = habit.date,
                count = habit.count,
                color = habit.color,
                period = habit.period,
                type = habit.type.ordinal,
                priority = habit.priority.ordinal,
                description = habit.description,
                name = habit.name,
                doneDates = habit.doneDates
            )
        }
    }

    fun toHabit() = Habit (
        name = name,
        description = description,
        priority = PriorityHabit.createByPriority(priority),
        color = color,
        count = count,
        type = TypeHabit.createByType(type),
        date = date,
        id = id,
        period = period,
        doneDates = doneDates
    )
}