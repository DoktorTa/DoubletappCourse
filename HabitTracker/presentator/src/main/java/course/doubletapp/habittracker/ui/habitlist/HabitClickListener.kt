package course.doubletapp.habittracker.ui.habitlist

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.view.Menu
import android.view.View
import android.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.vm.HabitListViewModel

class HabitClickListener(
    private val context: Context,
    private val navController: NavController,
    private val activity: Activity,
    private val habitListViewModel: HabitListViewModel
){
    companion object{
        private const val HABIT_EDIT_CODE = 0
        private const val HABIT_REMOVE_CODE = 1
        private const val HABIT_COMPLETE_CODE = 2

        private const val HABIT_KEY_BUNDLE_DATA = "Habit"
    }

    fun habitClickListener(view: View, idHabit: String) {
        val popupMenu = PopupMenu(context, view)

        popupMenu.menu.add(0, HABIT_EDIT_CODE, Menu.NONE,
            context.getString(R.string.habit_menu_edit))
        popupMenu.menu.add(0, HABIT_REMOVE_CODE, Menu.NONE,
            context.getString(R.string.habit_menu_remove))
        popupMenu.menu.add(0, HABIT_COMPLETE_CODE, Menu.NONE,
            context.getString(R.string.habit_menu_complete))

        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                HABIT_EDIT_CODE -> {
                    navController.navigate(
                        R.id.action_centralFragment_to_habitCreateFragment,
                        bundleOf(HABIT_KEY_BUNDLE_DATA to idHabit)
                    )
                }
                HABIT_REMOVE_CODE -> {
                    createRemoveDialog(idHabit)
                }
                HABIT_COMPLETE_CODE -> {
                    habitListViewModel.completeHabit(idHabit)
//                    val text = context.getString(textAnswer, argument)
//                    Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                }
            }
            return@setOnMenuItemClickListener true
        }
        popupMenu.show()
    }


    private fun createRemoveDialog(name: String){
        val builder = AlertDialog.Builder(activity)
        builder
            .setMessage(R.string.habit_remove_dialog_msg)
            .setPositiveButton(R.string.habit_remove_dialog_ok) { _, _ -> habitListViewModel.removeHabit(name)}
            .setNegativeButton(R.string.habit_remove_dialog_cansel) { dialog, _ -> dialog.cancel()}
        builder.create().show()

    }
}