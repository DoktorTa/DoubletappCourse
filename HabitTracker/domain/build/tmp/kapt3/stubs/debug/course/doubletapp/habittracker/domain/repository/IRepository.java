package course.doubletapp.habittracker.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\fH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcourse/doubletapp/habittracker/domain/repository/IRepository;", "", "createHabit", "Lcourse/doubletapp/habittracker/domain/ApiResponse;", "Lcourse/doubletapp/habittracker/domain/entity/HabitUid;", "habit", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "(Lcourse/doubletapp/habittracker/domain/entity/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneHabit", "", "editHabit", "getAllHabit", "Lkotlinx/coroutines/flow/Flow;", "", "getHabitById", "id", "", "loadHabitFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeHabit", "domain_debug"})
public abstract interface IRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> getAllHabit();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadHabitFromServer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract course.doubletapp.habittracker.domain.entity.Habit getHabitById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<course.doubletapp.habittracker.domain.entity.HabitUid>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<course.doubletapp.habittracker.domain.entity.HabitUid>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object doneHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<kotlin.Unit>> continuation);
}