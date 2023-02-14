package course.doubletapp.habittracker.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import course.doubletapp.habittracker.domain.uc.HabitsUseCase

class HabitListViewModelFactory(
    val useCase: course.doubletapp.habittracker.domain.uc.HabitsUseCase,

    ): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return HabitListViewModel(useCase) as T
    }
}
