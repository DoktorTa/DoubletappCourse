package course.doubletapp.habittracker.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcourse/doubletapp/habittracker/data/network/HabitServerAPI;", "", "doneHabit", "", "habitDoneDTO", "Lcourse/doubletapp/habittracker/data/network/data/HabitDoneServer;", "(Lcourse/doubletapp/habittracker/data/network/data/HabitDoneServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabits", "", "Lcourse/doubletapp/habittracker/data/network/data/HabitServer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeHabit", "habitUid", "Lcourse/doubletapp/habittracker/data/network/data/HabitUidServer;", "(Lcourse/doubletapp/habittracker/data/network/data/HabitUidServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveHabit", "habitDTO", "(Lcourse/doubletapp/habittracker/data/network/data/HabitServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface HabitServerAPI {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "habit")
    public abstract java.lang.Object getHabits(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<course.doubletapp.habittracker.data.network.data.HabitServer>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "habit_done")
    public abstract java.lang.Object doneHabit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    course.doubletapp.habittracker.data.network.data.HabitDoneServer habitDoneDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "habit")
    public abstract java.lang.Object saveHabit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    course.doubletapp.habittracker.data.network.data.HabitServer habitDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super course.doubletapp.habittracker.data.network.data.HabitUidServer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.HTTP(method = "DELETE", path = "habit", hasBody = true)
    public abstract java.lang.Object removeHabit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    course.doubletapp.habittracker.data.network.data.HabitUidServer habitUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}