package course.doubletapp.habittracker.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import course.doubletapp.habittracker.data.di.RepositoryModule
import course.doubletapp.habittracker.domain.uc.HabitsUseCase
import course.doubletapp.habittracker.ui.habitcreate.HabitCreateFragment
import course.doubletapp.habittracker.ui.habitlist.HabitListFragment
import course.doubletapp.habittracker.vm.HabitCreateViewModel
import course.doubletapp.habittracker.vm.HabitListViewModel
import course.doubletapp.habittracker.vm.HabitListViewModelFactory
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
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

    fun habitCreateSubComponent(): HabitCreateSubComponent.Builder

    fun habitListSubComponent(): HabitListFactorySubComponent.Builder
}