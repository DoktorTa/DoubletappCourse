package course.doubletapp.habittracker.di

import course.doubletapp.habittracker.ui.habitcreate.HabitCreateFragment
import dagger.Subcomponent

@Subcomponent
interface HabitCreateSubComponent {
    @Subcomponent.Builder
    interface Builder{
        fun build(): HabitCreateSubComponent
    }

    fun inject(habitCreateFragment: HabitCreateFragment)
}