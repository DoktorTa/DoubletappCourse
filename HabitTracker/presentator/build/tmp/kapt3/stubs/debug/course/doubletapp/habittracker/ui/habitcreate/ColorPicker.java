package course.doubletapp.habittracker.ui.habitcreate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcourse/doubletapp/habittracker/ui/habitcreate/ColorPicker;", "", "context", "Landroid/content/Context;", "colorPickerView", "Landroid/view/View;", "colorSelectedSquare", "aboutColorText", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "colors", "", "", "selectedColor", "getSelectedColor", "()Ljava/lang/Integer;", "setSelectedColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "changeColorSelectedSquare", "", "idColor", "generateGradient", "Landroid/graphics/drawable/GradientDrawable;", "generateGradientArray", "", "generateInfoBySelectedColor", "generateRadioButton", "Landroidx/appcompat/widget/AppCompatRadioButton;", "color", "", "generateRadioGroup", "radioGroup", "Landroid/widget/RadioGroup;", "getHSVText", "getLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "presentator_debug"})
public final class ColorPicker {
    private final android.content.Context context = null;
    private final android.view.View colorPickerView = null;
    private final android.view.View colorSelectedSquare = null;
    private final android.view.View aboutColorText = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedColor;
    private final java.util.List<java.lang.Integer> colors = null;
    
    public ColorPicker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View colorPickerView, @org.jetbrains.annotations.NotNull()
    android.view.View colorSelectedSquare, @org.jetbrains.annotations.NotNull()
    android.view.View aboutColorText) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedColor() {
        return null;
    }
    
    public final void setSelectedColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    private final android.graphics.drawable.GradientDrawable generateGradient() {
        return null;
    }
    
    private final int[] generateGradientArray() {
        return null;
    }
    
    private final void generateRadioGroup(android.widget.RadioGroup radioGroup) {
    }
    
    private final void generateInfoBySelectedColor() {
    }
    
    private final java.lang.String getHSVText(int color) {
        return null;
    }
    
    private final androidx.appcompat.widget.AppCompatRadioButton generateRadioButton(java.lang.String color) {
        return null;
    }
    
    private final android.widget.LinearLayout.LayoutParams getLayoutParams() {
        return null;
    }
    
    public final void changeColorSelectedSquare(int idColor) {
    }
}