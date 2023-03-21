package course.doubletapp.habittracker.ui.habitcreate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitcreate/HabitCreateFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcourse/doubletapp/habittracker/databinding/FragmentHabitCreateBinding;", "colorPicker", "Lcourse/doubletapp/habittracker/ui/habitcreate/ColorPicker;", "dateHabit", "", "doneDateHabit", "", "habitCreateViewModel", "Lcourse/doubletapp/habittracker/vm/HabitCreateViewModel;", "getHabitCreateViewModel", "()Lcourse/doubletapp/habittracker/vm/HabitCreateViewModel;", "setHabitCreateViewModel", "(Lcourse/doubletapp/habittracker/vm/HabitCreateViewModel;)V", "idHabit", "", "typeHabit", "addHabit", "", "canselButtonClick", "checkValidValues", "", "createColorPicker", "createViewModel", "generateRadioButton", "loadHabitField", "habit", "Lcourse/doubletapp/habittracker/domain/entity/Habit;", "okButtonClick", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setObserver", "setSpinnerAdapter", "presentator_debug"})
public final class HabitCreateFragment extends androidx.fragment.app.Fragment {
    private course.doubletapp.habittracker.databinding.FragmentHabitCreateBinding binding;
    private course.doubletapp.habittracker.ui.habitcreate.ColorPicker colorPicker;
    @javax.inject.Inject()
    public course.doubletapp.habittracker.vm.HabitCreateViewModel habitCreateViewModel;
    private java.lang.String typeHabit;
    private java.lang.String idHabit = "";
    private int dateHabit;
    private java.util.List<java.lang.Integer> doneDateHabit;
    
    public HabitCreateFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final course.doubletapp.habittracker.vm.HabitCreateViewModel getHabitCreateViewModel() {
        return null;
    }
    
    public final void setHabitCreateViewModel(@org.jetbrains.annotations.NotNull()
    course.doubletapp.habittracker.vm.HabitCreateViewModel p0) {
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
    
    private final void createViewModel() {
    }
    
    private final void loadHabitField(course.doubletapp.habittracker.domain.entity.Habit habit) {
    }
    
    private final void generateRadioButton() {
    }
    
    private final void createColorPicker() {
    }
    
    private final void setSpinnerAdapter() {
    }
    
    private final void setObserver() {
    }
    
    private final void okButtonClick() {
    }
    
    private final void canselButtonClick() {
    }
    
    private final boolean checkValidValues() {
        return false;
    }
    
    private final void addHabit() {
    }
}