package course.doubletapp.habittracker.data.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcourse/doubletapp/habittracker/data/di/RepositoryModule;", "", "()V", "provideRepository", "Lcourse/doubletapp/habittracker/domain/repository/IRepository;", "habitDao", "Lcourse/doubletapp/habittracker/data/db/HabitDao;", "habitAPI", "Lcourse/doubletapp/habittracker/data/network/HabitServerAPI;", "data_debug"})
@dagger.Module(includes = {course.doubletapp.habittracker.data.di.NetworkModel.class, course.doubletapp.habittracker.data.di.DatabaseModule.class})
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final course.doubletapp.habittracker.domain.repository.IRepository provideRepository(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.db.HabitDao habitDao, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.data.network.HabitServerAPI habitAPI) {
        return null;
    }
}