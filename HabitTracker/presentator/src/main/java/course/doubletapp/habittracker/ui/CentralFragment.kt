package course.doubletapp.habittracker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentCentralBinding

class CentralFragment: Fragment() {

    private lateinit var binding: FragmentCentralBinding
    private lateinit var adapterViewPager: ViewPagerAdapter

    private val types: Array<String> = TypeHabit.values().map{it.toString()}.toTypedArray()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCentralBinding.inflate(inflater)

        if (isAdded) {
            setObservers()
            setViewPagerAdapter()
            setTabLayout()
        }

        return binding.root
    }

    private fun setObservers(){
        binding.createHabitFAB.setOnClickListener {
            navigateToCreateFragment()
        }
    }

    private fun setTabLayout(){
        val tabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, binding.viewPager2) { tab, position ->
            tab.text = types[position]
        }.attach()
    }

    private fun setViewPagerAdapter(){
        val habitList = binding.viewPager2

        adapterViewPager = ViewPagerAdapter(childFragmentManager, lifecycle)
        habitList.adapter = adapterViewPager

        habitList.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val filterBottomSheet = binding.bottomSheet.getFragment<FilterBottomSheet>()
                filterBottomSheet.setHabitListViewModel(TypeHabit.valueOf(types[position]))
            }
        })
    }

    private fun navigateToCreateFragment(){
        findNavController().navigate(R.id.action_centralFragment_to_habitCreateFragment)
    }

}