// Generated by data binding compiler. Do not edit!
package com.omarismayilov.busybag.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.domain.model.User;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAccountBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final MaterialButton btnLogout;

  @NonNull
  public final ConstraintLayout constraintLayout7;

  @NonNull
  public final View divider11;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final ConstraintLayout lyBirthday;

  @NonNull
  public final ConstraintLayout lyEmail;

  @NonNull
  public final ConstraintLayout lyGender;

  @NonNull
  public final ConstraintLayout lyNumber;

  @NonNull
  public final ConstraintLayout lyPassword;

  @NonNull
  public final ShapeableImageView shapeableImageView3;

  @NonNull
  public final TextView textView48;

  @NonNull
  public final TextView textView50;

  @NonNull
  public final TextView textView52;

  @NonNull
  public final TextView textView53;

  @NonNull
  public final TextView tvName;

  @Bindable
  protected User mUser;

  protected FragmentAccountBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView btnBack, MaterialButton btnLogout, ConstraintLayout constraintLayout7,
      View divider11, ImageView imageView10, ImageView imageView11, ImageView imageView12,
      ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6,
      ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout9,
      ConstraintLayout lyBirthday, ConstraintLayout lyEmail, ConstraintLayout lyGender,
      ConstraintLayout lyNumber, ConstraintLayout lyPassword,
      ShapeableImageView shapeableImageView3, TextView textView48, TextView textView50,
      TextView textView52, TextView textView53, TextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.btnLogout = btnLogout;
    this.constraintLayout7 = constraintLayout7;
    this.divider11 = divider11;
    this.imageView10 = imageView10;
    this.imageView11 = imageView11;
    this.imageView12 = imageView12;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.linearLayout9 = linearLayout9;
    this.lyBirthday = lyBirthday;
    this.lyEmail = lyEmail;
    this.lyGender = lyGender;
    this.lyNumber = lyNumber;
    this.lyPassword = lyPassword;
    this.shapeableImageView3 = shapeableImageView3;
    this.textView48 = textView48;
    this.textView50 = textView50;
    this.textView52 = textView52;
    this.textView53 = textView53;
    this.tvName = tvName;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_account, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAccountBinding>inflateInternal(inflater, R.layout.fragment_account, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_account, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAccountBinding>inflateInternal(inflater, R.layout.fragment_account, null, false, component);
  }

  public static FragmentAccountBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentAccountBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAccountBinding)bind(component, view, R.layout.fragment_account);
  }
}