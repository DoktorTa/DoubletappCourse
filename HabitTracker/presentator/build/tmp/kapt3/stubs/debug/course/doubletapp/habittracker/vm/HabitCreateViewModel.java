package course.doubletapp.habittracker.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\\\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcourse/doubletapp/habittracker/vm/HabitCreateViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;", "(Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;)V", "addHabit", "", "name", "", "description", "priority", "Lcourse/doubletapp/habittracker/domain/entity/PriorityHabit;", "type", "Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;", "countDay", "", "period", "color", "id", "date", "doneDate", "", "getHabitByName", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "idHabit", "presentator_debug"})
public final class HabitCreateViewModel extends androidx.lifecycle.ViewModel {
    private final course.doubletapp.habittracker.domain.uc.HabitsUseCase useCase = null;
    
    @javax.inject.Inject()
    public HabitCreateViewModel(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.uc.HabitsUseCase useCase) {
        super();
    }
    
    public final void addHabit(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.PriorityHabit priority, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.TypeHabit type, int countDay, int period, int color, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int date, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> doneDate) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final course.doubletapp.habittracker.domain.entity.Habit getHabitByName(@org.jetbrains.annotations.NotNull()
    java.lang.String idHabit) {
        return null;
    }
}