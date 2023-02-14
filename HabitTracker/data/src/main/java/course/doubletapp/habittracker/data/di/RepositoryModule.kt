package course.doubletapp.habittracker.data.di

import course.doubletapp.habittracker.data.db.HabitDao
import course.doubletapp.habittracker.data.network.HabitServerAPI
import course.doubletapp.habittracker.data.repository.HabitServerRepository
import course.doubletapp.habittracker.domain.repository.IRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModel::class, DatabaseModule::class])
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(habitDao: HabitDao, habitAPI: HabitServerAPI): IRepository {
        return HabitServerRepository(habitDao, habitAPI)
    }

}