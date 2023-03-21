// Generated by Dagger (https://dagger.dev).
package course.doubletapp.habittracker.vm;

import course.doubletapp.habittracker.domain.uc.HabitsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HabitListViewModelFactory_Factory implements Factory<HabitListViewModelFactory> {
  private final Provider<HabitsUseCase> useCaseProvider;

  public HabitListViewModelFactory_Factory(Provider<HabitsUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public HabitListViewModelFactory get() {
    return newInstance(useCaseProvider.get());
  }

  public static HabitListViewModelFactory_Factory create(Provider<HabitsUseCase> useCaseProvider) {
    return new HabitListViewModelFactory_Factory(useCaseProvider);
  }

  public static HabitListViewModelFactory newInstance(HabitsUseCase useCase) {
    return new HabitListViewModelFactory(useCase);
  }
}
