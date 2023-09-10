// Generated by data binding compiler. Do not edit!
package com.omarismayilov.busybag.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.omarismayilov.busybag.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCartBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnCheckout;

  @NonNull
  public final MaterialButton button;

  @NonNull
  public final View divider7;

  @NonNull
  public final View divider8;

  @NonNull
  public final TextInputEditText etMax;

  @NonNull
  public final LottieAnimationView loadingView;

  @NonNull
  public final MaterialCardView materialCardView;

  @NonNull
  public final RecyclerView rvCart;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView38;

  @NonNull
  public final TextView textView39;

  @NonNull
  public final TextView textView40;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final TextView textView42;

  @NonNull
  public final TextView textView43;

  @NonNull
  public final TextView textView44;

  @NonNull
  public final TextView tvEmpty;

  @Bindable
  protected Double mTotal;

  @Bindable
  protected Integer mSize;

  protected FragmentCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnCheckout, MaterialButton button, View divider7, View divider8,
      TextInputEditText etMax, LottieAnimationView loadingView, MaterialCardView materialCardView,
      RecyclerView rvCart, TextInputLayout textInputLayout, TextView textView11,
      TextView textView38, TextView textView39, TextView textView40, TextView textView41,
      TextView textView42, TextView textView43, TextView textView44, TextView tvEmpty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCheckout = btnCheckout;
    this.button = button;
    this.divider7 = divider7;
    this.divider8 = divider8;
    this.etMax = etMax;
    this.loadingView = loadingView;
    this.materialCardView = materialCardView;
    this.rvCart = rvCart;
    this.textInputLayout = textInputLayout;
    this.textView11 = textView11;
    this.textView38 = textView38;
    this.textView39 = textView39;
    this.textView40 = textView40;
    this.textView41 = textView41;
    this.textView42 = textView42;
    this.textView43 = textView43;
    this.textView44 = textView44;
    this.tvEmpty = tvEmpty;
  }

  public abstract void setTotal(@Nullable Double total);

  @Nullable
  public Double getTotal() {
    return mTotal;
  }

  public abstract void setSize(@Nullable Integer size);

  @Nullable
  public Integer getSize() {
    return mSize;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, null, false, component);
  }

  public static FragmentCartBinding bind(@NonNull View view) {
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
  public static FragmentCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCartBinding)bind(component, view, R.layout.fragment_cart);
  }
}
