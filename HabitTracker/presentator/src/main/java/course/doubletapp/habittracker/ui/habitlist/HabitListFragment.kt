package course.doubletapp.habittracker.ui.habitlist

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentListHabitBinding
import course.doubletapp.habittracker.vm.HabitListViewModel
import course.doubletapp.habittracker.vm.HabitListViewModelFactory
import javax.inject.Inject

class HabitListFragment: Fragment() {

    private lateinit var binding: FragmentListHabitBinding
    private lateinit var adapter: HabitListRecyclerAdapter
    private lateinit var habitListViewModel: HabitListViewModel
    @Inject lateinit var habitListViewModelFactory: HabitListViewModelFactory

    private lateinit var habitClickListener: HabitClickListener

    companion object {
        private const val HABIT_TYPE = "TYPE"

        fun newInstance(typeHabit: TypeHabit): HabitListFragment {
            val fragment = HabitListFragment()
            fragment.arguments = bundleOf(HABIT_TYPE to typeHabit)
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListHabitBinding.inflate(inflater)

        if (isAdded) {
            (arguments?.get(HABIT_TYPE) as? TypeHabit)?.let { typeHabit ->
                createViewModel(typeHabit)
            }
            habitClickListenerCreate()
            setRecyclerAdapter()
            setObservers()
            habitListViewModel.loadHabit()
        }

        return binding.root
    }

    private fun habitClickListenerCreate(){
        habitClickListener = HabitClickListener(
            context = requireContext(),
            navController = findNavController(),
            activity = requireActivity(),
            habitListViewModel = habitListViewModel
        )
    }

    override fun onAttach(context: Context) {
        (requireActivity().application as HabitTrackerApplication)
            .appComponent
            .habitListSubComponent()
            .build()
            .inject(this)

        super.onAttach(context)
    }

    private fun createViewModel(typeHabit: TypeHabit){
        habitListViewModel = ViewModelProvider(requireActivity(), habitListViewModelFactory)[
                typeHabit.toString(), HabitListViewModel::class.java
        ]
        habitListViewModel.resetFilter(typeHabit)
    }

    private fun setObservers(){
        habitListViewModel.allHabits.observe(viewLifecycleOwner) {
            adapter.submitList(listOf()) // Это фиксит очень странный баг
            adapter.submitList(habitListViewModel
                .applyFilters(habitListViewModel.nowFilters.value!!))
        }

        habitListViewModel.nowFilters.observe(viewLifecycleOwner) {
            adapter.submitList(listOf())
            adapter.submitList(habitListViewModel
                .applyFilters(habitListViewModel.nowFilters.value!!))
        }

        habitListViewModel.infoText.observe(viewLifecycleOwner) {
            if (it.first != 0){
                val string = requireContext().getString(it.first, it.second)
                Toast.makeText(requireContext(), string, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setRecyclerAdapter(){
        val habitList = binding.habitListRecyclerView

        adapter = HabitListRecyclerAdapter(habitClickListener)

        habitList.adapter = adapter

        val layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false)
        habitList.layoutManager = layoutManager
    }
}
