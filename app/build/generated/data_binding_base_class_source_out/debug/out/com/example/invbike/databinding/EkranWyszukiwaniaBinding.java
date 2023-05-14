// Generated by view binder compiler. Do not edit!
package com.example.invbike.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.invbike.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EkranWyszukiwaniaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button buttonLook;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final SearchView searchView;

  private EkranWyszukiwaniaBinding(@NonNull ConstraintLayout rootView, @NonNull Button button3,
      @NonNull Button button5, @NonNull Button button6, @NonNull Button buttonLook,
      @NonNull ImageView imageView, @NonNull SearchView searchView) {
    this.rootView = rootView;
    this.button3 = button3;
    this.button5 = button5;
    this.button6 = button6;
    this.buttonLook = buttonLook;
    this.imageView = imageView;
    this.searchView = searchView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EkranWyszukiwaniaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EkranWyszukiwaniaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ekran_wyszukiwania, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EkranWyszukiwaniaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button_look;
      Button buttonLook = ViewBindings.findChildViewById(rootView, id);
      if (buttonLook == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      return new EkranWyszukiwaniaBinding((ConstraintLayout) rootView, button3, button5, button6,
          buttonLook, imageView, searchView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
