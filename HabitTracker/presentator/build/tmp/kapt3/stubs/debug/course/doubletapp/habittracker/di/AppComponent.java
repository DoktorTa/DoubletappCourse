package course.doubletapp.habittracker.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcourse/doubletapp/habittracker/di/AppComponent;", "", "getHabitUseCase", "Lcourse/doubletapp/habittracker/domain/uc/HabitsUseCase;", "habitCreateSubComponent", "Lcourse/doubletapp/habittracker/di/HabitCreateSubComponent$Builder;", "habitListSubComponent", "Lcourse/doubletapp/habittracker/di/HabitListFactorySubComponent$Builder;", "Builder", "presentator_debug"})
@dagger.Component(modules = {course.doubletapp.habittracker.data.di.RepositoryModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract course.doubletapp.habittracker.domain.uc.HabitsUseCase getHabitUseCase();
    
    @org.jetbrains.annotations.NotNull()
    public abstract course.doubletapp.habittracker.di.HabitCreateSubComponent.Builder habitCreateSubComponent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract course.doubletapp.habittracker.di.HabitListFactorySubComponent.Builder habitListSubComponent();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcourse/doubletapp/habittracker/di/AppComponent$Builder;", "", "build", "Lcourse/doubletapp/habittracker/di/AppComponent;", "context", "Landroid/content/Context;", "presentator_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract course.doubletapp.habittracker.di.AppComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract course.doubletapp.habittracker.di.AppComponent build();
    }
}