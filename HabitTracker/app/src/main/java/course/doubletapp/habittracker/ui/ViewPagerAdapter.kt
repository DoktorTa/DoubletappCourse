package course.doubletapp.habittracker.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.ui.habitlist.HabitListFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    companion object {
        private const val COUNT_PAGE: Int = 2
    }

    override fun getItemCount(): Int {
        return COUNT_PAGE
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HabitListFragment.newInstance(TypeHabit.GOOD)
        }
        return HabitListFragment.newInstance(TypeHabit.BAD)
    }
}