package course.doubletapp.habittracker.ui.habitlist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.databinding.FragmentHabitListBinding
import course.doubletapp.habittracker.ui.habitcreate.HabitCreateActivity
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListFragment(
    private val habitListViewModel: HabitListViewModel
): Fragment(), GoToHabitCreateListener {

    private lateinit var binding: FragmentHabitListBinding
    private lateinit var adapter: HabitListRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHabitListBinding.inflate(inflater)

        if (isAdded) {
            setRecyclerView()
            setObservers()
        }

        return binding.root
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
        adapter = HabitListRecyclerAdapter(requireContext(), habitListViewModel, this)

        val habitList = binding.habitListRecyclerView
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        habitList.layoutManager = layoutManager
        habitList.adapter = adapter
    }

    override fun goToHabitCreateListener(name: String) {
        goToCreateHabitActivity(name)
    }
}