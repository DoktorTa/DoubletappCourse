package course.doubletapp.habittracker.ui.habitlist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import course.doubletapp.habittracker.HabitTrackerApplication
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.databinding.FragmentHabitListBinding
import course.doubletapp.habittracker.ui.habitcreate.HabitCreateActivity
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListFragment: Fragment(), GoToHabitCreateListener {

    private lateinit var binding: FragmentHabitListBinding
    private lateinit var adapter: HabitListRecyclerAdapter
    private lateinit var habitListViewModel: HabitListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitListBinding.inflate(inflater)

        if (isAdded) {
            createViewModel()
            setRecyclerView()
            setObservers()
        }

        return binding.root
    }

    private fun createViewModel(){
        val habitUseCase = (requireActivity().application as HabitTrackerApplication).ticketUseCase
        habitListViewModel = HabitListViewModel(habitUseCase)
    }

    private fun setObservers(){
        habitListViewModel.allHabits.observe(viewLifecycleOwner) {
                ticket -> ticket.let {adapter.submitList(it)}
        }
        binding.createHabitFAB.setOnClickListener {
                goToCreateHabitActivity(null)
        }
    }

    private fun goToCreateHabitActivity(name: String?){
        val intent: Intent = Intent(requireContext(), HabitCreateActivity::class.java)
        if (name != null){
            val habit: Habit = habitListViewModel.getHabitForName(name)
            habitListViewModel.removeHabit(name)
            intent.putExtra("habit", habit)
        }
        startActivity(intent)
    }

    private fun setRecyclerView(){
        val habitList = binding.habitListRecyclerView

        adapter = HabitListRecyclerAdapter(
            requireContext(), habitListViewModel, this)
        habitList.adapter = adapter

        val layoutManager = LinearLayoutManager(
            context, LinearLayoutManager.VERTICAL, false)
        habitList.layoutManager = layoutManager
    }

    override fun goToHabitCreateListener(name: String) {
        goToCreateHabitActivity(name)
    }
}