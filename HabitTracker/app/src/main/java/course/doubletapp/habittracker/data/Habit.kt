package course.doubletapp.habittracker.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import course.doubletapp.habittracker.db.HabitEntity
import course.doubletapp.habittracker.net.HabitServer
import kotlinx.parcelize.Parcelize

@Parcelize
data class Habit(
    @PrimaryKey var name: String,
    var description: String,
    var priority: PriorityHabit,
    var type: TypeHabit,
    var countDay: Int,
    var period: Int,
    var color: Int,

    var id: String,
    var date: Int
) : Parcelable {

    companion object {
        fun fromHabitEntity(habitEntity: HabitEntity): Habit {
            return Habit(
                id = habitEntity.id,
                date = habitEntity.date,
                countDay = habitEntity.countDay,
                color = habitEntity.color,
                period = habitEntity.period,
                type = habitEntity.type,
                priority = habitEntity.priority,
                description = habitEntity.description,
                name = habitEntity.name
            )
        }
    }

        fun toHabitEntity() = HabitEntity (
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

