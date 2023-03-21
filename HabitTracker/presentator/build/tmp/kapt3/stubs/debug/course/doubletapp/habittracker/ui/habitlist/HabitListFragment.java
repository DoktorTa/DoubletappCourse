package course.doubletapp.habittracker.ui.habitlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitlist/HabitListFragment;", "Landroidx/fragment/app/Fragment;", "Lcourse/doubletapp/habittracker/ui/habitlist/HabitClickListener;", "()V", "adapter", "Lcourse/doubletapp/habittracker/ui/habitlist/HabitListRecyclerAdapter;", "binding", "Lcourse/doubletapp/habittracker/databinding/FragmentListHabitBinding;", "habitListViewModel", "Lcourse/doubletapp/habittracker/vm/HabitListViewModel;", "habitListViewModelFactory", "Lcourse/doubletapp/habittracker/vm/HabitListViewModelFactory;", "getHabitListViewModelFactory", "()Lcourse/doubletapp/habittracker/vm/HabitListViewModelFactory;", "setHabitListViewModelFactory", "(Lcourse/doubletapp/habittracker/vm/HabitListViewModelFactory;)V", "createRemoveDialog", "", "name", "", "createViewModel", "typeHabit", "Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;", "habitClickListener", "view", "Landroid/view/View;", "idHabit", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setObservers", "setRecyclerAdapter", "Companion", "presentator_debug"})
public final class HabitListFragment extends androidx.fragment.app.Fragment implements course.doubletapp.habittracker.ui.habitlist.HabitClickListener {
    private course.doubletapp.habittracker.databinding.FragmentListHabitBinding binding;
    private course.doubletapp.habittracker.ui.habitlist.HabitListRecyclerAdapter adapter;
    private course.doubletapp.habittracker.vm.HabitListViewModel habitListViewModel;
    @javax.inject.Inject()
    public course.doubletapp.habittracker.vm.HabitListViewModelFactory habitListViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public static final course.doubletapp.habittracker.ui.habitlist.HabitListFragment.Companion Companion = null;
    private static final java.lang.String HABIT_TYPE = "TYPE";
    private static final int HABIT_EDIT_CODE = 0;
    private static final int HABIT_REMOVE_CODE = 1;
    private static final int HABIT_COMPLETE_CODE = 2;
    
    public HabitListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.vm.HabitListViewModelFactory getHabitListViewModelFactory() {
        return null;
    }
    
    public final void setHabitListViewModelFactory(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.vm.HabitListViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void createViewModel(course.doubletapp.habittracker.domain.entity.TypeHabit typeHabit) {
    }
    
    private final void setObservers() {
    }
    
    private final void setRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void habitClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String idHabit) {
    }
    
    private final void createRemoveDialog(java.lang.String name) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitlist/HabitListFragment$Companion;", "", "()V", "HABIT_COMPLETE_CODE", "", "HABIT_EDIT_CODE", "HABIT_REMOVE_CODE", "HABIT_TYPE", "", "newInstance", "Lcourse/doubletapp/habittracker/ui/habitlist/HabitListFragment;", "typeHabit", "Lcourse/doubletapp/habittracker/domain/entity/TypeHabit;", "presentator_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final course.doubletapp.habittracker.ui.habitlist.HabitListFragment newInstance(@org.jetbrains.annotations.NotNull()
        course.doubletapp.habittracker.domain.entity.TypeHabit typeHabit) {
            return null;
        }
    }
}