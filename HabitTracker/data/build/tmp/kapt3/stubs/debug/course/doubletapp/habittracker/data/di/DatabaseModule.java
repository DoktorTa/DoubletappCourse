package course.doubletapp.habittracker.data.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcourse/doubletapp/habittracker/data/di/DatabaseModule;", "", "()V", "provideDao", "Lcourse/doubletapp/habittracker/data/db/HabitDao;", "database", "Lcourse/doubletapp/habittracker/data/db/HabitDataBase;", "provideDatabase", "context", "Landroid/content/Context;", "data_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final course.doubletapp.habittracker.data.db.HabitDao provideDao(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.db.HabitDataBase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final course.doubletapp.habittracker.data.db.HabitDataBase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}