package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import course.doubletapp.habittracker.uc.HabitsUseCase

class HabitListViewModelFactory(
    val useCase: HabitsUseCase,

): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return HabitListViewModel(useCase) as T
    }
}
