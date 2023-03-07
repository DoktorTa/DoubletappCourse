package course.doubletapp.habittracker.di

import course.doubletapp.habittracker.ui.habitlist.HabitListFragment
import dagger.Subcomponent

@Subcomponent
interface HabitListFactorySubComponent {
    @Subcomponent.Builder
    interface Builder{
        fun build(): HabitListFactorySubComponent
    }

    fun inject(habitListFragment: HabitListFragment)
}
