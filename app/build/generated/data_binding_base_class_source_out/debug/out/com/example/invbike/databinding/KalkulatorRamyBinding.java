// Generated by view binder compiler. Do not edit!
package com.example.invbike.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.invbike.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class KalkulatorRamyBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button10;

  @NonNull
  public final Button button11;

  @NonNull
  public final Button button12;

  @NonNull
  public final EditText editTextNumber2;

  @NonNull
  public final EditText editTextNumber3;

  @NonNull
  public final EditText editTextNumber4;

  @NonNull
  public final EditText editTextNumber5;

  @NonNull
  public final EditText editTextNumber6;

  @NonNull
  public final ImageView imageView3;

  private KalkulatorRamyBinding(@NonNull ConstraintLayout rootView, @NonNull Button button10,
      @NonNull Button button11, @NonNull Button button12, @NonNull EditText editTextNumber2,
      @NonNull EditText editTextNumber3, @NonNull EditText editTextNumber4,
      @NonNull EditText editTextNumber5, @NonNull EditText editTextNumber6,
      @NonNull ImageView imageView3) {
    this.rootView = rootView;
    this.button10 = button10;
    this.button11 = button11;
    this.button12 = button12;
    this.editTextNumber2 = editTextNumber2;
    this.editTextNumber3 = editTextNumber3;
    this.editTextNumber4 = editTextNumber4;
    this.editTextNumber5 = editTextNumber5;
    this.editTextNumber6 = editTextNumber6;
    this.imageView3 = imageView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static KalkulatorRamyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static KalkulatorRamyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.kalkulator_ramy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static KalkulatorRamyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button10;
      Button button10 = ViewBindings.findChildViewById(rootView, id);
      if (button10 == null) {
        break missingId;
      }

      id = R.id.button11;
      Button button11 = ViewBindings.findChildViewById(rootView, id);
      if (button11 == null) {
        break missingId;
      }

      id = R.id.button12;
      Button button12 = ViewBindings.findChildViewById(rootView, id);
      if (button12 == null) {
        break missingId;
      }

      id = R.id.editTextNumber2;
      EditText editTextNumber2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber2 == null) {
        break missingId;
      }

      id = R.id.editTextNumber3;
      EditText editTextNumber3 = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber3 == null) {
        break missingId;
      }

      id = R.id.editTextNumber4;
      EditText editTextNumber4 = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber4 == null) {
        break missingId;
      }

      id = R.id.editTextNumber5;
      EditText editTextNumber5 = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber5 == null) {
        break missingId;
      }

      id = R.id.editTextNumber6;
      EditText editTextNumber6 = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber6 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      return new KalkulatorRamyBinding((ConstraintLayout) rootView, button10, button11, button12,
          editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6,
          imageView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
