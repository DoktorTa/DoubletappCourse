package course.doubletapp.habittracker.ui.habitlist

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentListHabitBinding
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListFragment: Fragment(), HabitClickListener {

    private lateinit var binding: FragmentListHabitBinding
    private lateinit var adapter: HabitListRecyclerAdapter
    private lateinit var habitListViewModel: HabitListViewModel

    companion object {
        private const val HABIT_TYPE = "TYPE"

        private const val HABIT_EDIT_CODE = 0
        private const val HABIT_REMOVE_CODE = 1

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
        Log.d("HabitListFragment", "OnCreateView()")


        if (isAdded) {
            val typeHabit = arguments?.get(HABIT_TYPE) as? TypeHabit
            createViewModel(typeHabit!!)
            setRecyclerAdapter()
            setObservers()
        }

        return binding.root
    }

    private fun createViewModel(typeHabit: TypeHabit){
        val habitUseCase = (requireActivity().application as HabitTrackerApplication).ticketUseCase
        habitListViewModel = HabitListViewModel(habitUseCase, typeHabit)
    }

    private fun setObservers(){
        habitListViewModel.filteredAllHabits.observe(viewLifecycleOwner) {
                adapter.submitList(it)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }


    private fun setRecyclerAdapter(){
        val habitList = binding.habitListRecyclerView

        adapter = HabitListRecyclerAdapter(this)

        habitList.adapter = adapter

        val layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false)
        habitList.layoutManager = layoutManager
    }

    override fun habitClickListener(view: View, name: String) {
        val popupMenu = PopupMenu(requireContext(), view)
//        val position = habitListViewModel.getHabitForName(name)

        popupMenu.menu.add(0, HABIT_EDIT_CODE, Menu.NONE,
            requireContext().getString(R.string.habit_menu_edit))
        popupMenu.menu.add(0, HABIT_REMOVE_CODE, Menu.NONE,
            requireContext().getString(R.string.habit_menu_remove))

        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                HABIT_EDIT_CODE -> Log.d("PopUpMenu", "!")
                HABIT_REMOVE_CODE -> habitListViewModel.removeHabit(name)
            }
            return@setOnMenuItemClickListener true
        }

        popupMenu.show()
    }
}