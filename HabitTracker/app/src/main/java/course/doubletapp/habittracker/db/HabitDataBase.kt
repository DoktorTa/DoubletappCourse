package course.doubletapp.habittracker.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import course.doubletapp.habittracker.data.Habit


@Database(entities = [HabitEntity::class], version = 2)
abstract class HabitDataBase: RoomDatabase() {
    abstract fun habitDao(): HabitDao

    companion object {

        @Volatile private var INSTANCE: HabitDataBase? = null

        fun getInstance(context: Context): HabitDataBase{
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDataBase(context).also { INSTANCE = it }
            }
        }

        private fun buildDataBase(context: Context): HabitDataBase{
            return Room.databaseBuilder(
                context.applicationContext,
                HabitDataBase::class.java,
                "HABITS"
            )
                    .allowMainThreadQueries()
                    .build()
        }
    }

}