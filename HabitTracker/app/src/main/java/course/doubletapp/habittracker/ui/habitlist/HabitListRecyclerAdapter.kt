package course.doubletapp.habittracker.ui.habitlist

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.data.Habit
import course.doubletapp.habittracker.databinding.HabitItemBinding

class HabitListRecyclerAdapter(
    private val habitClickListener: HabitClickListener
    ): ListAdapter<Habit, HabitListRecyclerAdapter.HabitViewHolder>(HABIT_COMPARATOR){

    class HabitViewHolder(
        private val itemBinding: HabitItemBinding,
        private var habitClickListener: HabitClickListener
    ): RecyclerView.ViewHolder(itemBinding.root){

        fun bind(habit: Habit){
            itemBinding.nameHabit.text = habit.name
            itemBinding.descriptionHabit.text = habit.description

            val backgroundHabitColor: GradientDrawable =
                itemBinding.colorHabit.background as GradientDrawable
            backgroundHabitColor.setColor(habit.color)

            val info: String = itemView.context.getString(
                R.string.infoHabit,
                habit.priority,
                habit.type,
                habit.countDay.toString(),
                habit.period.toString()
            )

            itemBinding.infoHabit.text = info

            itemView.setOnClickListener {
                habitClickListener.habitClickListener(it, habit.name)
            }
        }
    }

    companion object {
        private val HABIT_COMPARATOR = object : DiffUtil.ItemCallback<Habit>() {
            override fun areItemsTheSame(oldItem: Habit, newItem: Habit): Boolean {
                return oldItem.name === newItem.name
            }

            override fun areContentsTheSame(oldItem: Habit, newItem: Habit): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HabitItemBinding.inflate(inflater, parent, false)
        return HabitViewHolder(binding, habitClickListener)
    }

    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}