package course.doubletapp.habittracker.di

import android.content.Context
import course.doubletapp.habittracker.data.di.RepositoryModule
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RepositoryModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun getHabitUseCase(): HabitsUseCase

}