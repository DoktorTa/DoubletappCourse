package course.doubletapp.habittracker.data.network.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<B[\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0004H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0004H\u00c6\u0003J\t\u0010.\u001a\u00020\u0004H\u00c6\u0003J\t\u0010/\u001a\u00020\u0004H\u00c6\u0003J\t\u00100\u001a\u00020\u0004H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0004H\u00c6\u0003Js\u00104\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0004H\u00d6\u0001J\u0006\u00109\u001a\u00020:J\t\u0010;\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b\u00a8\u0006="}, d2 = {"Lcourse/doubletapp/habittracker/data/network/data/HabitServer;", "", "done_dates", "", "", "uid", "", "frequency", "priority", "date", "type", "title", "description", "count", "color", "(Ljava/util/List;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;II)V", "getColor", "()I", "setColor", "(I)V", "getCount", "setCount", "getDate", "setDate", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDone_dates", "()Ljava/util/List;", "setDone_dates", "(Ljava/util/List;)V", "getFrequency", "setFrequency", "getPriority", "setPriority", "getTitle", "setTitle", "getType", "setType", "getUid", "setUid", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toHabitEntity", "Lcourse/doubletapp/habittracker/data/db/HabitEntity;", "toString", "Companion", "data_debug"})
public final class HabitServer {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> done_dates;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uid;
    private int frequency;
    private int priority;
    private int date;
    private int type;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    private int count;
    private int color;
    @org.jetbrains.annotations.NotNull()
    public static final course.doubletapp.habittracker.data.network.data.HabitServer.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.data.network.data.HabitServer copy(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> done_dates, @org.jetbrains.annotations.NotNull()
    java.lang.String uid, int frequency, int priority, int date, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int count, int color) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public HabitServer(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> done_dates, @org.jetbrains.annotations.NotNull()
    java.lang.String uid, int frequency, int priority, int date, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int count, int color) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getDone_dates() {
        return null;
    }
    
    public final void setDone_dates(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getFrequency() {
        return 0;
    }
    
    public final void setFrequency(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPriority() {
        return 0;
    }
    
    public final void setPriority(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getDate() {
        return 0;
    }
    
    public final void setDate(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.data.db.HabitEntity toHabitEntity() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcourse/doubletapp/habittracker/data/network/data/HabitServer$Companion;", "", "()V", "habitToHabitServer", "Lcourse/doubletapp/habittracker/data/network/data/HabitServer;", "habit", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final course.doubletapp.habittracker.data.network.data.HabitServer habitToHabitServer(@org.jetbrains.annotations.NotNull()
        course.doubletapp.habittracker.domain.entity.Habit habit) {
            return null;
        }
    }
}