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
import com.google.android.material.card.MaterialCardView;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.domain.model.CategoryUiModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCategoryBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final TextView textView6;

  @Bindable
  protected CategoryUiModel mCategory;

  protected ItemCategoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView cardView, TextView textView6) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.textView6 = textView6;
  }

  public abstract void setCategory(@Nullable CategoryUiModel category);

  @Nullable
  public CategoryUiModel getCategory() {
    return mCategory;
  }

  @NonNull
  public static ItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCategoryBinding>inflateInternal(inflater, R.layout.item_category, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCategoryBinding>inflateInternal(inflater, R.layout.item_category, null, false, component);
  }

  public static ItemCategoryBinding bind(@NonNull View view) {
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
  public static ItemCategoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCategoryBinding)bind(component, view, R.layout.item_category);
  }
}
