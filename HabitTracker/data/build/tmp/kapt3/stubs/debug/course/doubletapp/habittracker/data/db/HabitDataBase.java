package course.doubletapp.habittracker.data.db;

import java.lang.System;

@androidx.room.Database(entities = {course.doubletapp.habittracker.data.db.HabitEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcourse/doubletapp/habittracker/data/db/HabitDataBase;", "Landroidx/room/RoomDatabase;", "()V", "habitDao", "Lcourse/doubletapp/habittracker/data/db/HabitDao;", "Companion", "data_debug"})
public abstract class HabitDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final course.doubletapp.habittracker.data.db.HabitDataBase.Companion Companion = null;
    private static final java.lang.String DATABASE_NAME = "HABITS";
    
    public HabitDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract course.doubletapp.habittracker.data.db.HabitDao habitDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcourse/doubletapp/habittracker/data/db/HabitDataBase$Companion;", "", "()V", "DATABASE_NAME", "", "buildDataBase", "Lcourse/doubletapp/habittracker/data/db/HabitDataBase;", "context", "Landroid/content/Context;", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final course.doubletapp.habittracker.data.db.HabitDataBase buildDataBase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}