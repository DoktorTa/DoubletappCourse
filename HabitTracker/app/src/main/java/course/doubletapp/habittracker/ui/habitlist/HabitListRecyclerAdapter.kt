package course.doubletapp.habittracker.ui.habitlist

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.databinding.HabitItemBinding
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitListRecyclerAdapter(
    private val context: Context,
    private val habitListViewModel: HabitListViewModel,
    private val habitListFragment: HabitListFragment
):
    ListAdapter<Habit, HabitListRecyclerAdapter.HabitViewHolder>(HABIT_COMPARATOR){

    private val allHabits: LiveData<MutableList<Habit>> = habitListViewModel.allHabits

    class HabitViewHolder(val itemBinding: HabitItemBinding):
        RecyclerView.ViewHolder(itemBinding.root){}

    companion object {
        private val HABIT_COMPARATOR = object : DiffUtil.ItemCallback<Habit>() {
            override fun areItemsTheSame(oldItem: Habit, newItem: Habit): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Habit, newItem: Habit): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HabitItemBinding.inflate(inflater, parent, false)
        return HabitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        val habit: Habit = allHabits.value!![position]

        with(holder.itemBinding){
            nameHabit.text = habit.name
            descriptionHabit.text = habit.description

            val backgroundHabitColor: GradientDrawable = colorHabit.background as GradientDrawable
            backgroundHabitColor.setColor(habit.color)

            val info: String = context.getString(R.string.infoHabit,
                habit.priority,
                habit.type,
                habit.countDay.toString(),
                habit.period.toString())

            infoHabit.text = info
        }

        holder.itemView.setOnClickListener{
            view -> performOptionsMenuClick(holder, habit.name)
        }
    }

    // TODO: Bug меню открывается только в одном месте
    private fun performOptionsMenuClick(holder: HabitViewHolder, name: String) {
        val popupMenu = PopupMenu(context, holder.itemView)
        popupMenu.inflate(R.menu.habit_menu)

        popupMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener{
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                when(item?.itemId){
                    R.id.removeBut -> {
                        habitListViewModel.removeHabit(name)
                        notifyDataSetChanged()
                        return true
                    }
                    R.id.editBut -> {
                        habitListFragment.goToHabitCreateListener(name)
                        return true
                    }
                }
                return false
            }
        })
        popupMenu.show()
    }


}