// Generated by view binder compiler. Do not edit!
package com.symblcrowd.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.symblcrowd.calculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button BracesButton;

  @NonNull
  public final Button CommaButton;

  @NonNull
  public final TextView DisplayView;

  @NonNull
  public final Button DivideButton;

  @NonNull
  public final Button EightButton;

  @NonNull
  public final Button EqualButton;

  @NonNull
  public final Button FiveButton;

  @NonNull
  public final Button FourButton;

  @NonNull
  public final Button MinusButton;

  @NonNull
  public final Button MultiplyButton;

  @NonNull
  public final Button NineButton;

  @NonNull
  public final Button OneButton;

  @NonNull
  public final Button PlusButton;

  @NonNull
  public final Button SevenButton;

  @NonNull
  public final Button SixButton;

  @NonNull
  public final Button ThreeButton;

  @NonNull
  public final Button TwoButton;

  @NonNull
  public final ConstraintLayout WasIstDas;

  @NonNull
  public final Button ZeroButton;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button BracesButton,
      @NonNull Button CommaButton, @NonNull TextView DisplayView, @NonNull Button DivideButton,
      @NonNull Button EightButton, @NonNull Button EqualButton, @NonNull Button FiveButton,
      @NonNull Button FourButton, @NonNull Button MinusButton, @NonNull Button MultiplyButton,
      @NonNull Button NineButton, @NonNull Button OneButton, @NonNull Button PlusButton,
      @NonNull Button SevenButton, @NonNull Button SixButton, @NonNull Button ThreeButton,
      @NonNull Button TwoButton, @NonNull ConstraintLayout WasIstDas, @NonNull Button ZeroButton,
      @NonNull AppBarLayout appBarLayout, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.BracesButton = BracesButton;
    this.CommaButton = CommaButton;
    this.DisplayView = DisplayView;
    this.DivideButton = DivideButton;
    this.EightButton = EightButton;
    this.EqualButton = EqualButton;
    this.FiveButton = FiveButton;
    this.FourButton = FourButton;
    this.MinusButton = MinusButton;
    this.MultiplyButton = MultiplyButton;
    this.NineButton = NineButton;
    this.OneButton = OneButton;
    this.PlusButton = PlusButton;
    this.SevenButton = SevenButton;
    this.SixButton = SixButton;
    this.ThreeButton = ThreeButton;
    this.TwoButton = TwoButton;
    this.WasIstDas = WasIstDas;
    this.ZeroButton = ZeroButton;
    this.appBarLayout = appBarLayout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BracesButton;
      Button BracesButton = ViewBindings.findChildViewById(rootView, id);
      if (BracesButton == null) {
        break missingId;
      }

      id = R.id.CommaButton;
      Button CommaButton = ViewBindings.findChildViewById(rootView, id);
      if (CommaButton == null) {
        break missingId;
      }

      id = R.id.DisplayView;
      TextView DisplayView = ViewBindings.findChildViewById(rootView, id);
      if (DisplayView == null) {
        break missingId;
      }

      id = R.id.DivideButton;
      Button DivideButton = ViewBindings.findChildViewById(rootView, id);
      if (DivideButton == null) {
        break missingId;
      }

      id = R.id.EightButton;
      Button EightButton = ViewBindings.findChildViewById(rootView, id);
      if (EightButton == null) {
        break missingId;
      }

      id = R.id.EqualButton;
      Button EqualButton = ViewBindings.findChildViewById(rootView, id);
      if (EqualButton == null) {
        break missingId;
      }

      id = R.id.FiveButton;
      Button FiveButton = ViewBindings.findChildViewById(rootView, id);
      if (FiveButton == null) {
        break missingId;
      }

      id = R.id.FourButton;
      Button FourButton = ViewBindings.findChildViewById(rootView, id);
      if (FourButton == null) {
        break missingId;
      }

      id = R.id.MinusButton;
      Button MinusButton = ViewBindings.findChildViewById(rootView, id);
      if (MinusButton == null) {
        break missingId;
      }

      id = R.id.MultiplyButton;
      Button MultiplyButton = ViewBindings.findChildViewById(rootView, id);
      if (MultiplyButton == null) {
        break missingId;
      }

      id = R.id.NineButton;
      Button NineButton = ViewBindings.findChildViewById(rootView, id);
      if (NineButton == null) {
        break missingId;
      }

      id = R.id.OneButton;
      Button OneButton = ViewBindings.findChildViewById(rootView, id);
      if (OneButton == null) {
        break missingId;
      }

      id = R.id.PlusButton;
      Button PlusButton = ViewBindings.findChildViewById(rootView, id);
      if (PlusButton == null) {
        break missingId;
      }

      id = R.id.SevenButton;
      Button SevenButton = ViewBindings.findChildViewById(rootView, id);
      if (SevenButton == null) {
        break missingId;
      }

      id = R.id.SixButton;
      Button SixButton = ViewBindings.findChildViewById(rootView, id);
      if (SixButton == null) {
        break missingId;
      }

      id = R.id.ThreeButton;
      Button ThreeButton = ViewBindings.findChildViewById(rootView, id);
      if (ThreeButton == null) {
        break missingId;
      }

      id = R.id.TwoButton;
      Button TwoButton = ViewBindings.findChildViewById(rootView, id);
      if (TwoButton == null) {
        break missingId;
      }

      ConstraintLayout WasIstDas = (ConstraintLayout) rootView;

      id = R.id.ZeroButton;
      Button ZeroButton = ViewBindings.findChildViewById(rootView, id);
      if (ZeroButton == null) {
        break missingId;
      }

      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, BracesButton, CommaButton,
          DisplayView, DivideButton, EightButton, EqualButton, FiveButton, FourButton, MinusButton,
          MultiplyButton, NineButton, OneButton, PlusButton, SevenButton, SixButton, ThreeButton,
          TwoButton, WasIstDas, ZeroButton, appBarLayout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
