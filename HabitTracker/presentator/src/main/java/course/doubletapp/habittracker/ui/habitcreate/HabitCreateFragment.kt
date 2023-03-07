package course.doubletapp.habittracker.ui.habitcreate

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.domain.entity.Habit
import course.doubletapp.habittracker.domain.entity.PriorityHabit
import course.doubletapp.habittracker.domain.entity.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentHabitCreateBinding
import course.doubletapp.habittracker.vm.HabitCreateViewModel
import java.util.*
import javax.inject.Inject

class HabitCreateFragment: Fragment() {

    private lateinit var binding: FragmentHabitCreateBinding
    private lateinit var colorPicker: ColorPicker

    @Inject lateinit var habitCreateViewModel: HabitCreateViewModel

    private var typeHabit: String? = null
    private var idHabit: String = ""
    private var dateHabit: Int = (Date().time / 1000).toInt()
    private var doneDateHabit: List<Int> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitCreateBinding.inflate(inflater)

        if (isAdded) {
//            createViewModel()
            createColorPicker()
            setObserver()
            setSpinnerAdapter()
            generateRadioButton()

            if (arguments != null) {
                val habitEdit: Habit = habitCreateViewModel
                    .getHabitByName(requireArguments().getString("Habit")!!)!!
                loadHabitField(habitEdit)
            }

        }
        return binding.root
    }

    override fun onAttach(context: Context) {
        (requireActivity().application as HabitTrackerApplication)
            .appComponent
            .habitCreateSubComponent()
            .build()
            .inject(this)

        super.onAttach(context)
    }

    private fun createViewModel(){
        val appComponent = (requireActivity().application as HabitTrackerApplication).appComponent

        val habitUseCase = appComponent.getHabitUseCase()
        habitCreateViewModel = HabitCreateViewModel(habitUseCase)
    }

    private fun loadHabitField(habit: Habit){
        binding.nameHabit.setText(habit.name)
        binding.descriptionHabit.setText(habit.description)
        binding.countHabit.setText(habit.count.toString())
        binding.periodHabit.setText(habit.period.toString())

        colorPicker.changeColorSelectedSquare(habit.color)
        (binding.typeHabit.getChildAt(habit.type.ordinal) as RadioButton).isChecked = true
        binding.priorityHabit.setSelection(habit.priority.ordinal)

        idHabit = habit.id
        doneDateHabit = habit.doneDates
    }

    private fun generateRadioButton(){
        val radioGroup: RadioGroup = binding.typeHabit
        val typesHabit = TypeHabit.values().map{it.toString()}

        for (type in typesHabit) {
            val radioButton = RadioButton(context)
            radioButton.text = type
            radioGroup.addView(radioButton)
        }
    }

    private fun createColorPicker() {
        colorPicker = ColorPicker(requireContext(), binding.colorSquare, binding.colorSelectedSquare, binding.textAboutColorPicker)
    }

    private fun setSpinnerAdapter(){
        val priorityVariant: List<String> = PriorityHabit.values().map{it.toString()}
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_spinner_item,
            priorityVariant
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.priorityHabit.adapter = adapter
    }

    private fun setObserver(){
        binding.okButton.setOnClickListener {
            okButtonClick()
        }
        binding.canselButton.setOnClickListener {
            canselButtonClick()
        }
        binding.typeHabit.setOnCheckedChangeListener { _, checkedId ->
            binding.typeHabit.findViewById<RadioButton>(checkedId)?.apply {
                typeHabit = this.text.toString()
            }
        }
    }

    private fun okButtonClick(){
        if (checkValidValues()) {
            return
        }
        else {
            addHabit()
        }
    }

    private fun canselButtonClick(){
        findNavController().navigate(R.id.action_habitCreateFragment_to_centralFragment)
    }

    private fun checkValidValues(): Boolean {
        return (binding.nameHabit.text.isEmpty() ||
                binding.descriptionHabit.text.isEmpty()||
                binding.countHabit.text.isEmpty() ||
                binding.periodHabit.text.isEmpty() ||
                binding.typeHabit.checkedRadioButtonId == -1 ||
                binding.priorityHabit.selectedItem.toString().isEmpty() ||
                colorPicker.selectedColor == null)
    }

    private fun addHabit(){

        habitCreateViewModel.addHabit(
            name = binding.nameHabit.text.toString(),
            description = binding.descriptionHabit.text.toString(),
            period = binding.periodHabit.text.toString().toInt(),
            countDay = binding.countHabit.text.toString().toInt(),
            color = colorPicker.selectedColor!!,
            priority = PriorityHabit.valueOf(binding.priorityHabit.selectedItem.toString().uppercase()),
            type = TypeHabit.valueOf(typeHabit!!),
            id = idHabit,
            date = dateHabit,
            doneDate = doneDateHabit
        )

        canselButtonClick()
    }
}