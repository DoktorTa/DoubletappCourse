package course.doubletapp.habittracker.ui.habitlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitlist/HabitListRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "Lcourse/doubletapp/habittracker/ui/habitlist/HabitListRecyclerAdapter$HabitViewHolder;", "habitClickListener", "Lcourse/doubletapp/habittracker/ui/habitlist/HabitClickListener;", "(Lcourse/doubletapp/habittracker/ui/habitlist/HabitClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "HabitViewHolder", "presentator_debug"})
public final class HabitListRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<course.doubletapp.habittracker.domain.entity.Habit, course.doubletapp.habittracker.ui.habitlist.HabitListRecyclerAdapter.HabitViewHolder> {
    private final course.doubletapp.habittracker.ui.habitlist.HabitClickListener habitClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final course.doubletapp.habittracker.ui.habitlist.HabitListRecyclerAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<course.doubletapp.habittracker.domain.entity.Habit> HABIT_COMPARATOR = null;
    
    public HabitListRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.ui.habitlist.HabitClickListener habitClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public course.doubletapp.habittracker.ui.habitlist.HabitListRecyclerAdapter.HabitViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.ui.habitlist.HabitListRecyclerAdapter.HabitViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitlist/HabitListRecyclerAdapter$HabitViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcourse/doubletapp/habittracker/databinding/HabitItemBinding;", "habitClickListener", "Lcourse/doubletapp/habittracker/ui/habitlist/HabitClickListener;", "(Lcourse/doubletapp/habittracker/databinding/HabitItemBinding;Lcourse/doubletapp/habittracker/ui/habitlist/HabitClickListener;)V", "bind", "", "habit", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "presentator_debug"})
    public static final class HabitViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final course.doubletapp.habittracker.databinding.HabitItemBinding itemBinding = null;
        private course.doubletapp.habittracker.ui.habitlist.HabitClickListener habitClickListener;
        
        public HabitViewHolder(@org.jetbrains.annotations.NotNull()
        course.doubletapp.habittracker.databinding.HabitItemBinding itemBinding, @org.jetbrains.annotations.NotNull()
        course.doubletapp.habittracker.ui.habitlist.HabitClickListener habitClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        course.doubletapp.habittracker.domain.entity.Habit habit) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitlist/HabitListRecyclerAdapter$Companion;", "", "()V", "HABIT_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "presentator_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}