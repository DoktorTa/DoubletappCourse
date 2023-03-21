package course.doubletapp.habittracker.domain.uc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;", "", "repository", "Lcourse/doubletapp/habittracker/domain/repository/IRepository;", "(Lcourse/doubletapp/habittracker/domain/repository/IRepository;)V", "habits", "Landroidx/lifecycle/LiveData;", "", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "getHabits", "()Landroidx/lifecycle/LiveData;", "completeHabit", "", "habit", "createHabit", "editHabit", "newHabit", "getHabitById", "nameId", "", "getNumberRemainingExecutions", "", "loadHabitFromServer", "removeHabit", "updateDoneDate", "domain_debug"})
public final class HabitsUseCase {
    private final course.doubletapp.habittracker.domain.repository.IRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> habits = null;
    
    @javax.inject.Inject()
    public HabitsUseCase(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.repository.IRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> getHabits() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    public final void loadHabitFromServer() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    public final void createHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    public final void editHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit newHabit) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    public final void removeHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final course.doubletapp.habittracker.domain.entity.Habit getHabitById(@org.jetbrains.annotations.NotNull()
    java.lang.String nameId) {
        return null;
    }
    
    private final course.doubletapp.habittracker.domain.entity.Habit updateDoneDate(course.doubletapp.habittracker.domain.entity.Habit habit) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    public final void completeHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit) {
    }
    
    public final int getNumberRemainingExecutions(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit) {
        return 0;
    }
}