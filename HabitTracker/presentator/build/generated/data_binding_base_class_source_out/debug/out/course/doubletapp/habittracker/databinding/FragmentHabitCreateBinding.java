// Generated by view binder compiler. Do not edit!
package course.doubletapp.habittracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import course.doubletapp.habittracker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHabitCreateBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button canselButton;

  @NonNull
  public final HorizontalScrollView colorPicker;

  @NonNull
  public final View colorSelectedSquare;

  @NonNull
  public final RadioGroup colorSquare;

  @NonNull
  public final EditText countHabit;

  @NonNull
  public final RelativeLayout countLayout;

  @NonNull
  public final EditText descriptionHabit;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final EditText nameHabit;

  @NonNull
  public final Button okButton;

  @NonNull
  public final EditText periodHabit;

  @NonNull
  public final RelativeLayout periodLayout;

  @NonNull
  public final Spinner priorityHabit;

  @NonNull
  public final RelativeLayout priorityLayout;

  @NonNull
  public final TextView textAboutColorPicker;

  @NonNull
  public final RelativeLayout textColorPicker;

  @NonNull
  public final RadioGroup typeHabit;

  @NonNull
  public final RelativeLayout typeLayout;

  @NonNull
  public final LinearLayout valueHabitLayout;

  private FragmentHabitCreateBinding(@NonNull RelativeLayout rootView, @NonNull Button canselButton,
      @NonNull HorizontalScrollView colorPicker, @NonNull View colorSelectedSquare,
      @NonNull RadioGroup colorSquare, @NonNull EditText countHabit,
      @NonNull RelativeLayout countLayout, @NonNull EditText descriptionHabit,
      @NonNull LinearLayout linearLayout2, @NonNull EditText nameHabit, @NonNull Button okButton,
      @NonNull EditText periodHabit, @NonNull RelativeLayout periodLayout,
      @NonNull Spinner priorityHabit, @NonNull RelativeLayout priorityLayout,
      @NonNull TextView textAboutColorPicker, @NonNull RelativeLayout textColorPicker,
      @NonNull RadioGroup typeHabit, @NonNull RelativeLayout typeLayout,
      @NonNull LinearLayout valueHabitLayout) {
    this.rootView = rootView;
    this.canselButton = canselButton;
    this.colorPicker = colorPicker;
    this.colorSelectedSquare = colorSelectedSquare;
    this.colorSquare = colorSquare;
    this.countHabit = countHabit;
    this.countLayout = countLayout;
    this.descriptionHabit = descriptionHabit;
    this.linearLayout2 = linearLayout2;
    this.nameHabit = nameHabit;
    this.okButton = okButton;
    this.periodHabit = periodHabit;
    this.periodLayout = periodLayout;
    this.priorityHabit = priorityHabit;
    this.priorityLayout = priorityLayout;
    this.textAboutColorPicker = textAboutColorPicker;
    this.textColorPicker = textColorPicker;
    this.typeHabit = typeHabit;
    this.typeLayout = typeLayout;
    this.valueHabitLayout = valueHabitLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHabitCreateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHabitCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_habit_create, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHabitCreateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.canselButton;
      Button canselButton = ViewBindings.findChildViewById(rootView, id);
      if (canselButton == null) {
        break missingId;
      }

      id = R.id.colorPicker;
      HorizontalScrollView colorPicker = ViewBindings.findChildViewById(rootView, id);
      if (colorPicker == null) {
        break missingId;
      }

      id = R.id.colorSelectedSquare;
      View colorSelectedSquare = ViewBindings.findChildViewById(rootView, id);
      if (colorSelectedSquare == null) {
        break missingId;
      }

      id = R.id.colorSquare;
      RadioGroup colorSquare = ViewBindings.findChildViewById(rootView, id);
      if (colorSquare == null) {
        break missingId;
      }

      id = R.id.countHabit;
      EditText countHabit = ViewBindings.findChildViewById(rootView, id);
      if (countHabit == null) {
        break missingId;
      }

      id = R.id.count_layout;
      RelativeLayout countLayout = ViewBindings.findChildViewById(rootView, id);
      if (countLayout == null) {
        break missingId;
      }

      id = R.id.descriptionHabit;
      EditText descriptionHabit = ViewBindings.findChildViewById(rootView, id);
      if (descriptionHabit == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.nameHabit;
      EditText nameHabit = ViewBindings.findChildViewById(rootView, id);
      if (nameHabit == null) {
        break missingId;
      }

      id = R.id.okButton;
      Button okButton = ViewBindings.findChildViewById(rootView, id);
      if (okButton == null) {
        break missingId;
      }

      id = R.id.periodHabit;
      EditText periodHabit = ViewBindings.findChildViewById(rootView, id);
      if (periodHabit == null) {
        break missingId;
      }

      id = R.id.period_layout;
      RelativeLayout periodLayout = ViewBindings.findChildViewById(rootView, id);
      if (periodLayout == null) {
        break missingId;
      }

      id = R.id.priorityHabit;
      Spinner priorityHabit = ViewBindings.findChildViewById(rootView, id);
      if (priorityHabit == null) {
        break missingId;
      }

      id = R.id.priority_layout;
      RelativeLayout priorityLayout = ViewBindings.findChildViewById(rootView, id);
      if (priorityLayout == null) {
        break missingId;
      }

      id = R.id.text_about_color_picker;
      TextView textAboutColorPicker = ViewBindings.findChildViewById(rootView, id);
      if (textAboutColorPicker == null) {
        break missingId;
      }

      id = R.id.text_color_picker;
      RelativeLayout textColorPicker = ViewBindings.findChildViewById(rootView, id);
      if (textColorPicker == null) {
        break missingId;
      }

      id = R.id.typeHabit;
      RadioGroup typeHabit = ViewBindings.findChildViewById(rootView, id);
      if (typeHabit == null) {
        break missingId;
      }

      id = R.id.type_layout;
      RelativeLayout typeLayout = ViewBindings.findChildViewById(rootView, id);
      if (typeLayout == null) {
        break missingId;
      }

      id = R.id.value_habit_layout;
      LinearLayout valueHabitLayout = ViewBindings.findChildViewById(rootView, id);
      if (valueHabitLayout == null) {
        break missingId;
      }

      return new FragmentHabitCreateBinding((RelativeLayout) rootView, canselButton, colorPicker,
          colorSelectedSquare, colorSquare, countHabit, countLayout, descriptionHabit,
          linearLayout2, nameHabit, okButton, periodHabit, periodLayout, priorityHabit,
          priorityLayout, textAboutColorPicker, textColorPicker, typeHabit, typeLayout,
          valueHabitLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
