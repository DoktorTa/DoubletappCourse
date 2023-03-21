package course.doubletapp.habittracker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcourse/doubletapp/habittracker/HabitTrackerApplication;", "Landroid/app/Application;", "()V", "<set-?>", "Lcourse/doubletapp/habittracker/di/AppComponent;", "appComponent", "getAppComponent", "()Lcourse/doubletapp/habittracker/di/AppComponent;", "onCreate", "", "Companion", "presentator_debug"})
public final class HabitTrackerApplication extends android.app.Application {
    private course.doubletapp.habittracker.di.AppComponent appComponent;
    @org.jetbrains.annotations.NotNull()
    public static final course.doubletapp.habittracker.HabitTrackerApplication.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static course.doubletapp.habittracker.HabitTrackerApplication mInstance;
    
    public HabitTrackerApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.di.AppComponent getAppComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcourse/doubletapp/habittracker/HabitTrackerApplication$Companion;", "", "()V", "mInstance", "Lcourse/doubletapp/habittracker/HabitTrackerApplication;", "getMInstance", "()Lcourse/doubletapp/habittracker/HabitTrackerApplication;", "setMInstance", "(Lcourse/doubletapp/habittracker/HabitTrackerApplication;)V", "getContext", "Landroid/content/Context;", "getInstance", "presentator_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final course.doubletapp.habittracker.HabitTrackerApplication getMInstance() {
            return null;
        }
        
        public final void setMInstance(@org.jetbrains.annotations.Nullable()
        course.doubletapp.habittracker.HabitTrackerApplication p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final course.doubletapp.habittracker.HabitTrackerApplication getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
    }
}