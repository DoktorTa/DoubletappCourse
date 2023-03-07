package course.doubletapp.habittracker.ui

import android.R
import course.doubletapp.habittracker.R as MyR
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentFilterBottomSheetBinding
import course.doubletapp.habittracker.vm.HabitListViewModel
import course.doubletapp.habittracker.vm.HabitListViewModelFactory


class FilterBottomSheet(): Fragment() {

    private lateinit var binding: FragmentFilterBottomSheetBinding
    private lateinit var habitListViewModel: HabitListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilterBottomSheetBinding.inflate(inflater)

        if (isAdded) {
            setSpinnerAdapter()
            setHabitListViewModel(TypeHabit.GOOD)
            setObserver()
        }

        return binding.root
    }

    private fun setObserver(){
        setObserverOnNameFilter()
        setObserverOnDescriptionFilter()
        setObserverOnPriorityFilter()

        setObserverResetButton()
    }

    private fun setObserverResetButton(){
        binding.resetButton.setOnClickListener {
            habitListViewModel.resetFilter()
        }
    }

    fun setHabitListViewModel(typeHabit: TypeHabit){
        val appComponent = (requireActivity().application as HabitTrackerApplication).appComponent

        val habitUseCase = appComponent.getHabitUseCase()
        habitListViewModel = ViewModelProvider(requireActivity(), HabitListViewModelFactory(habitUseCase))[
                typeHabit.toString(), HabitListViewModel::class.java
        ]
        habitListViewModel.resetFilter()
    }

    private fun setSpinnerAdapter(){

        val priorityVariant: MutableList<String> = PriorityHabit.values().map{it.toString()}.toMutableList()
        priorityVariant.add(0, requireContext().getString(MyR.string.priority_type_habit_all))
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            requireContext(),
            R.layout.simple_spinner_item,
            priorityVariant
        )
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        binding.filterByPriorityHabit.adapter = adapter
    }

    private fun setObserverOnPriorityFilter(){
        binding.filterByPriorityHabit.setOnItemSelectedListener(object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parentView: AdapterView<*>?) {}

            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                if (binding.filterByPriorityHabit.selectedItem.toString().uppercase()
                    != requireContext().getString(MyR.string.priority_type_habit_all)){
                    val priorityFilter = PriorityHabit.valueOf(
                        binding.filterByPriorityHabit.selectedItem.toString().uppercase()
                    )
                    habitListViewModel.searchByPriority(priorityFilter)
                } else {
                    habitListViewModel.searchByPriority(null)
                }
            }
        })
    }

    private fun setObserverOnNameFilter(){
        binding.filterByNameHabit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val filter = p0.toString()
                habitListViewModel.searchByName(filter)
            }
        })
    }

    private fun setObserverOnDescriptionFilter(){
        binding.filterByDescriptionHabit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val filter = p0.toString()
                habitListViewModel.searchByDescription(filter)
            }
        })
    }

}