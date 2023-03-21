package course.doubletapp.habittracker.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0013J\u0012\u0010\"\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0017J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0013J\u000e\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u0013J\u0010\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006+"}, d2 = {"Lcourse/doubletapp/habittracker/vm/HabitListViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;", "(Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;)V", "allHabits", "Landroidx/lifecycle/LiveData;", "", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "getAllHabits", "()Landroidx/lifecycle/LiveData;", "setAllHabits", "(Landroidx/lifecycle/LiveData;)V", "nowFilters", "Landroidx/lifecycle/MutableLiveData;", "Lcourse/doubletapp/habittracker/vm/Filters;", "getNowFilters", "()Landroidx/lifecycle/MutableLiveData;", "serverStatus", "", "getServerStatus", "setServerStatus", "typeHabitsInPage", "Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;", "getUseCase", "()Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;", "applyFilters", "", "filters", "completeHabit", "idHabit", "loadHabit", "", "removeHabit", "resetFilter", "typeHabits", "searchByDescription", "description", "searchByName", "name", "searchByPriority", "priority", "Lcourse/doubletapp/habittracker/domain/entity/PriorityHabit;", "presentator_debug"})
public final class HabitListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final course.doubletapp.habittracker.domain.uc.HabitsUseCase useCase = null;
    private course.doubletapp.habittracker.domain.entity.TypeHabit typeHabitsInPage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> allHabits;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> serverStatus;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<course.doubletapp.habittracker.vm.Filters> nowFilters = null;
    
    public HabitListViewModel(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.uc.HabitsUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.domain.uc.HabitsUseCase getUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> getAllHabits() {
        return null;
    }
    
    public final void setAllHabits(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getServerStatus() {
        return null;
    }
    
    public final void setServerStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<course.doubletapp.habittracker.vm.Filters> getNowFilters() {
        return null;
    }
    
    public final void loadHabit() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<course.doubletapp.habittracker.domain.entity.Habit> applyFilters(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.vm.Filters filters) {
        return null;
    }
    
    public final void searchByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void searchByDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    public final void searchByPriority(@org.jetbrains.annotations.Nullable()
    course.doubletapp.habittracker.domain.entity.PriorityHabit priority) {
    }
    
    public final void resetFilter(@org.jetbrains.annotations.Nullable()
    course.doubletapp.habittracker.domain.entity.TypeHabit typeHabits) {
    }
    
    public final void removeHabit(@org.jetbrains.annotations.NotNull()
    java.lang.String idHabit) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String completeHabit(@org.jetbrains.annotations.NotNull()
    java.lang.String idHabit) {
        return null;
    }
}