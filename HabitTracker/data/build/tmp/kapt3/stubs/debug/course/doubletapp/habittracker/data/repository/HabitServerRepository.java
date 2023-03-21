package course.doubletapp.habittracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u0011H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcourse/doubletapp/habittracker/data/repository/HabitServerRepository;", "Lcourse/doubletapp/habittracker/domain/repository/IRepository;", "habitsDao", "Lcourse/doubletapp/habittracker/data/db/HabitDao;", "habitServerAPI", "Lcourse/doubletapp/habittracker/data/network/HabitServerAPI;", "(Lcourse/doubletapp/habittracker/data/db/HabitDao;Lcourse/doubletapp/habittracker/data/network/HabitServerAPI;)V", "createHabit", "Lcourse/doubletapp/habittracker/domain/ApiResponse;", "Lcourse/doubletapp/habittracker/domain/entity/HabitUid;", "habit", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "(Lcourse/doubletapp/habittracker/domain/entity/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneHabit", "", "editHabit", "getAllHabit", "Lkotlinx/coroutines/flow/Flow;", "", "getHabitById", "id", "", "loadHabitFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeHabit", "updateHabitInLocalDatabase", "Lcourse/doubletapp/habittracker/data/db/HabitEntity;", "(Lcourse/doubletapp/habittracker/data/db/HabitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class HabitServerRepository implements course.doubletapp.habittracker.domain.repository.IRepository {
    private final course.doubletapp.habittracker.data.db.HabitDao habitsDao = null;
    private final course.doubletapp.habittracker.data.network.HabitServerAPI habitServerAPI = null;
    
    @javax.inject.Inject()
    public HabitServerRepository(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.db.HabitDao habitsDao, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.network.HabitServerAPI habitServerAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<course.doubletapp.habittracker.domain.entity.Habit>> getAllHabit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadHabitFromServer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<kotlin.Unit>> continuation) {
        return null;
    }
    
    private final java.lang.Object updateHabitInLocalDatabase(course.doubletapp.habittracker.data.db.HabitEntity habit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public course.doubletapp.habittracker.domain.entity.Habit getHabitById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<course.doubletapp.habittracker.domain.entity.HabitUid>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object editHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<course.doubletapp.habittracker.domain.entity.HabitUid>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doneHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.domain.ApiResponse<kotlin.Unit>> continuation) {
        return null;
    }
}