package course.doubletapp.habittracker.ui.habitcreate

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.view.isEmpty
import androidx.fragment.app.Fragment
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.data.PriorityHabit
import course.doubletapp.habittracker.databinding.FragmentHabitCreateBinding
import course.doubletapp.habittracker.vm.HabitCreateViewModel


class HabitCreateFragment(
//    private val habitCreateViewModel: HabitCreateViewModel
): Fragment() {

    private lateinit var binding: FragmentHabitCreateBinding
    private lateinit var colorPicker: ColorHabitPicker

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitCreateBinding.inflate(inflater)

        if (isAdded) {
            createColorPicker()
            setObserver()
            setSpinnerAdapter()
        }
        return binding.root
    }

    private fun createColorPicker() {
        colorPicker = ColorHabitPicker(requireContext(), binding.colorSelectedSquare)
        binding.colorSquare.background = colorPicker.generateGradient()
        colorPicker.generateRadioGroup(binding.colorSquare)
    }

    private fun setSpinnerAdapter(){
        val spinner: Spinner = binding.spinnerPriorityHabit


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
            view -> canselButtonClick(view)
        }
    }

    private fun okButtonClick(view: View){
        if (checkValidValues()) {
            Log.d("HabitCreateFragment", "FALSE")
        } else {
            Log.d("HabitCreateFragment", "TRUE")
        }
    }

    private fun canselButtonClick(view: View){
        TODO("Implemends")
    }

    private fun checkValidValues(): Boolean {
        return (binding.nameHabit.text.isEmpty() ||
                binding.descriptionHabit.text.isEmpty() ||
                binding.countHabit.text.isEmpty() ||
                binding.periodHabit.text.isEmpty() ||
                binding.typeHabit.checkedRadioButtonId == -1 ||
                binding.spinnerPriorityHabit.isEmpty() ||
                colorPicker.selectedColor == null)
    }
//
//    private fun addHabit(){
//        habitCreateViewModel.addHabit(
//            name = binding.nameHabit.text.toString(),
//            description = binding.descriptionHabit.text.toString(),
//            period = binding.periodHabit.text.toString().toInt(),
//            countDay = binding.countHabit.text.toString().toInt(),
//            color = colorPicker.selectedColor!!
//
//            )
//    }

}