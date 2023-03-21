package course.doubletapp.habittracker.domain.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\nH\u00c6\u0003Js\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u00c6\u0001J\t\u0010;\u001a\u00020\nH\u00d6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\t\u0010@\u001a\u00020\nH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006G"}, d2 = {"Lcourse/doubletapp/habittracker/domain/entity/Habit;", "Landroid/os/Parcelable;", "name", "", "description", "priority", "Lcourse/doubletapp/habittracker/domain/entity/PriorityHabit;", "type", "Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;", "count", "", "period", "color", "id", "date", "doneDates", "", "(Ljava/lang/String;Ljava/lang/String;Lcourse/doubletapp/habittracker/domain/entity/PriorityHabit;Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;IIILjava/lang/String;ILjava/util/List;)V", "getColor", "()I", "setColor", "(I)V", "getCount", "setCount", "getDate", "setDate", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDoneDates", "()Ljava/util/List;", "setDoneDates", "(Ljava/util/List;)V", "getId", "setId", "getName", "setName", "getPeriod", "setPeriod", "getPriority", "()Lcourse/doubletapp/habittracker/domain/entity/PriorityHabit;", "setPriority", "(Lcourse/doubletapp/habittracker/domain/entity/PriorityHabit;)V", "getType", "()Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;", "setType", "(Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_debug"})
public final class Habit implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private course.doubletapp.habittracker.domain.entity.PriorityHabit priority;
    @org.jetbrains.annotations.NotNull()
    private course.doubletapp.habittracker.domain.entity.TypeHabit type;
    private int count;
    private int period;
    private int color;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    private int date;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> doneDates;
    public static final android.os.Parcelable.Creator<course.doubletapp.habittracker.domain.entity.Habit> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.domain.entity.Habit copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.PriorityHabit priority, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.TypeHabit type, int count, int period, int color, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int date, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> doneDates) {
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
    
    public Habit(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.PriorityHabit priority, @org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.TypeHabit type, int count, int period, int color, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int date, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> doneDates) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.domain.entity.PriorityHabit component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.domain.entity.PriorityHabit getPriority() {
        return null;
    }
    
    public final void setPriority(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.PriorityHabit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.domain.entity.TypeHabit component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.domain.entity.TypeHabit getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.domain.entity.TypeHabit p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getPeriod() {
        return 0;
    }
    
    public final void setPeriod(int p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getDate() {
        return 0;
    }
    
    public final void setDate(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getDoneDates() {
        return null;
    }
    
    public final void setDoneDates(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<course.doubletapp.habittracker.domain.entity.Habit> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final course.doubletapp.habittracker.domain.entity.Habit createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final course.doubletapp.habittracker.domain.entity.Habit[] newArray(int size) {
            return null;
        }
    }
}