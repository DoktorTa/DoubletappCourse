package course.doubletapp.habittracker.data.di

import android.content.Context
import androidx.room.Database
import course.doubletapp.habittracker.data.db.HabitDao
import course.doubletapp.habittracker.data.db.HabitDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDao(database: HabitDataBase): HabitDao {
        return database.habitDao()
    }

    @Singleton
    @Provides
    fun provideDatabase(context: Context): HabitDataBase {
        return HabitDataBase.buildDataBase(context)
    }

}