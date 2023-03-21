package course.doubletapp.habittracker.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcourse/doubletapp/habittracker/data/db/HabitDao;", "", "createHabit", "", "habit", "Lcourse/doubletapp/habittracker/data/db/HabitEntity;", "(Lcourse/doubletapp/habittracker/data/db/HabitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editHabit", "getAllHabits", "Lkotlinx/coroutines/flow/Flow;", "", "getHabitById", "id", "", "removeHabit", "data_debug"})
public abstract interface HabitDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HabitEntity")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<course.doubletapp.habittracker.data.db.HabitEntity>> getAllHabits();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM HabitEntity WHERE id = :id")
    public abstract course.doubletapp.habittracker.data.db.HabitEntity getHabitById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object createHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.db.HabitEntity habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object editHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.db.HabitEntity habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeHabit(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.db.HabitEntity habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}