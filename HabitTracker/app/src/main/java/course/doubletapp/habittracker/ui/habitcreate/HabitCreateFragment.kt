package course.doubletapp.habittracker.ui.habitcreate

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.data.TypeHabit
import course.doubletapp.habittracker.databinding.FragmentHabitCreateBinding
import course.doubletapp.habittracker.ui.habitlist.HabitListActivity
import course.doubletapp.habittracker.vm.HabitCreateViewModel


class HabitCreateFragment: Fragment() {

    private lateinit var binding: FragmentHabitCreateBinding
    private lateinit var colorPicker: ColorHabitPicker
    private lateinit var habitCreateViewModel: HabitCreateViewModel

    private var typeHabit: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitCreateBinding.inflate(inflater)

        if (isAdded) {
            createViewModel()
            createColorPicker()
            setObserver()
            setSpinnerAdapter()

            val arg = requireActivity().intent.extras
            if (arg != null) {
                loadHabitField(arg.get("habit") as Habit)
            }

            generateRadioButton()
        }
        return binding.root
    }

    private fun createViewModel(){
        val habitUseCase = (requireActivity().application as HabitTrackerApplication).ticketUseCase
        habitCreateViewModel = HabitCreateViewModel(habitUseCase)
    }

    private fun loadHabitField(habit: Habit){
        binding.nameHabit.setText(habit.name)
        binding.descriptionHabit.setText(habit.description)
        binding.countHabit.setText(habit.countDay.toString())
        binding.periodHabit.setText(habit.period.toString())

        colorPicker.changeColorSelectedSquare(habit.color)
        typeHabit = habit.type

        val spinnerPos: Int = PriorityHabit.values().map{it.toString()}.indexOf(habit.priority)
        binding.spinnerPriorityHabit.setSelection(spinnerPos)
    }

    private fun generateRadioButton(){
        val radioGroup: RadioGroup = binding.typeHabit
        val typesHabit = TypeHabit.values().map{it.toString()}

        for (type in typesHabit) {
            val radioButton = RadioButton(context)
            radioButton.setText(type)
            if (type == typeHabit) {
                radioButton.isChecked = true
            }
            radioGroup.addView(radioButton)
        }
    }

    private fun createColorPicker() {
        colorPicker = ColorHabitPicker(requireContext(), binding.colorSelectedSquare)
        binding.colorSquare.background = colorPicker.generateGradient()
        colorPicker.generateRadioGroup(binding.colorSquare)
    }

    private fun setSpinnerAdapter(){
        val priorityVariant: List<String> = PriorityHabit.values().map{it.toString()}
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_spinner_item,
            priorityVariant
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerPriorityHabit.adapter = adapter
    }

    private fun setObserver(){
        binding.okButton.setOnClickListener {
            view -> okButtonClick(view)
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

    private fun okButtonClick(view: View){
        if (checkValidValues()) {
            return
        }
        else {
            addHabit()
        }
    }

    private fun canselButtonClick(){
        val intent = Intent(requireContext(), HabitListActivity::class.java)
        startActivity(intent)
    }

    private fun checkValidValues(): Boolean {
        return (binding.nameHabit.text.isEmpty() ||
                binding.descriptionHabit.text.isEmpty()||
                binding.countHabit.text.isEmpty() ||
                binding.periodHabit.text.isEmpty() ||
                binding.typeHabit.checkedRadioButtonId == -1 ||
                binding.spinnerPriorityHabit.selectedItem.toString().isEmpty() ||
                colorPicker.selectedColor == null)
    }

    private fun addHabit(){
        habitCreateViewModel.addHabit(
            name = binding.nameHabit.text.toString(),
            description = binding.descriptionHabit.text.toString(),
            period = binding.periodHabit.text.toString().toInt(),
            countDay = binding.countHabit.text.toString().toInt(),
            color = colorPicker.selectedColor!!,
            priority = binding.spinnerPriorityHabit.selectedItem.toString(),
            type = typeHabit!!
        )

        canselButtonClick()
    }
}