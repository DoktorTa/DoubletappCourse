package course.doubletapp.habittracker.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [HabitEntity::class], version = 2)
abstract class HabitDataBase: RoomDatabase() {
    abstract fun habitDao(): HabitDao

    companion object {
        private const val DATABASE_NAME = "HABITS"

        fun buildDataBase(context: Context): HabitDataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                HabitDataBase::class.java,
                DATABASE_NAME
            ).allowMainThreadQueries()
                .build()
        }
    }

}