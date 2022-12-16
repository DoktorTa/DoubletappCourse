package course.doubletapp.habittracker.util

import androidx.recyclerview.widget.DiffUtil
import course.doubletapp.habittracker.data.Habit

class HabitsDiffUtilCallBack(
    private val newList: MutableList<Habit>,
    private val oldList: MutableList<Habit>
): DiffUtil.Callback() {


    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem: Habit = oldList[oldItemPosition]
        val newItem: Habit = newList[newItemPosition]
        return oldItem.hashCode() == newItem.hashCode()
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem: Habit = oldList[oldItemPosition]
        val newItem: Habit = newList[newItemPosition]
        return oldItem.name == newItem.name
    }
}