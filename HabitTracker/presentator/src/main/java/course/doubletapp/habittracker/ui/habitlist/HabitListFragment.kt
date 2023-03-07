package course.doubletapp.habittracker.ui.habitlist

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentListHabitBinding
import course.doubletapp.habittracker.vm.HabitListViewModel
import course.doubletapp.habittracker.vm.HabitListViewModelFactory
import javax.inject.Inject

class HabitListFragment: Fragment(), HabitClickListener {

    private lateinit var binding: FragmentListHabitBinding
    private lateinit var adapter: HabitListRecyclerAdapter
    private lateinit var habitListViewModel: HabitListViewModel
    @Inject lateinit var habitListViewModelFactory: HabitListViewModelFactory

    companion object {
        private const val HABIT_TYPE = "TYPE"

        private const val HABIT_EDIT_CODE = 0
        private const val HABIT_REMOVE_CODE = 1
        private const val HABIT_COMPLETE_CODE = 2

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
            val typeHabit = arguments?.get(HABIT_TYPE) as? TypeHabit
            createViewModel(typeHabit!!)
            setRecyclerAdapter()
            setObservers()
            habitListViewModel.loadHabit()
        }

        return binding.root
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
//        val appComponent = (requireActivity().application as HabitTrackerApplication).appComponent
//
//        val habitUseCase = appComponent.getHabitUseCase()
//
//        (requireActivity().application as HabitTrackerApplication)
//            .appComponent
//            .habitListSubComponent()
//            .build()
//            .inject(this)

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

        habitListViewModel.serverStatus.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }
    }

    private fun setRecyclerAdapter(){
        val habitList = binding.habitListRecyclerView

        adapter = HabitListRecyclerAdapter(this)

        habitList.adapter = adapter

        val layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false)
        habitList.layoutManager = layoutManager
    }

    override fun habitClickListener(view: View, idHabit: String) {
        Log.d("HabitListFragment", "11111111111111111 $idHabit")
        val popupMenu = PopupMenu(requireContext(), view)

        popupMenu.menu.add(0, HABIT_EDIT_CODE, Menu.NONE,
            requireContext().getString(R.string.habit_menu_edit))
        popupMenu.menu.add(0, HABIT_REMOVE_CODE, Menu.NONE,
            requireContext().getString(R.string.habit_menu_remove))
        popupMenu.menu.add(0, HABIT_COMPLETE_CODE, Menu.NONE,
            requireContext().getString(R.string.habit_menu_complete))

        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                HABIT_EDIT_CODE -> {
                    findNavController().navigate(
                        R.id.action_centralFragment_to_habitCreateFragment,
                        bundleOf("Habit" to idHabit)
                    )
                }
                HABIT_REMOVE_CODE -> {
                    createRemoveDialog(idHabit)
                }
                HABIT_COMPLETE_CODE -> {
                    val textAnswer = habitListViewModel.completeHabit(idHabit)
                    Toast.makeText(requireContext(), textAnswer, Toast.LENGTH_LONG).show()

                }
            }
            return@setOnMenuItemClickListener true
        }

        popupMenu.show()
    }

    private fun createRemoveDialog(name: String){
        val builder = AlertDialog.Builder(requireActivity())
        builder
            .setMessage(R.string.habit_remove_dialog_msg)
            .setPositiveButton(R.string.habit_remove_dialog_ok) {_, _ -> habitListViewModel.removeHabit(name)}
            .setNegativeButton(R.string.habit_remove_dialog_cansel) {dialog, _ -> dialog.cancel()}
        builder.create().show()

    }
}