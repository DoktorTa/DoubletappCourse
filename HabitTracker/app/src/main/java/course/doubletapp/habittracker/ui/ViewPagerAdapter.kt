package course.doubletapp.habittracker.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.ui.habitlist.HabitListFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = TypeHabit.values().size

    override fun createFragment(position: Int): Fragment {
        return HabitListFragment.newInstance(TypeHabit.values()[position])
    }
}