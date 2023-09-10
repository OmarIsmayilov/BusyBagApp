package com.omarismayilov.busybag.presentation.ui.profile.account.editAccount;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.omarismayilov.busybag.common.InfoEnum;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditAccountFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditAccountFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private EditAccountFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static EditAccountFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditAccountFragmentArgs __result = new EditAccountFragmentArgs();
    bundle.setClassLoader(EditAccountFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("infoName")) {
      InfoEnum infoName;
      if (Parcelable.class.isAssignableFrom(InfoEnum.class) || Serializable.class.isAssignableFrom(InfoEnum.class)) {
        infoName = (InfoEnum) bundle.get("infoName");
      } else {
        throw new UnsupportedOperationException(InfoEnum.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (infoName == null) {
        throw new IllegalArgumentException("Argument \"infoName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("infoName", infoName);
    } else {
      throw new IllegalArgumentException("Required argument \"infoName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditAccountFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    EditAccountFragmentArgs __result = new EditAccountFragmentArgs();
    if (savedStateHandle.contains("infoName")) {
      InfoEnum infoName;
      infoName = savedStateHandle.get("infoName");
      if (infoName == null) {
        throw new IllegalArgumentException("Argument \"infoName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("infoName", infoName);
    } else {
      throw new IllegalArgumentException("Required argument \"infoName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public InfoEnum getInfoName() {
    return (InfoEnum) arguments.get("infoName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("infoName")) {
      InfoEnum infoName = (InfoEnum) arguments.get("infoName");
      if (Parcelable.class.isAssignableFrom(InfoEnum.class) || infoName == null) {
        __result.putParcelable("infoName", Parcelable.class.cast(infoName));
      } else if (Serializable.class.isAssignableFrom(InfoEnum.class)) {
        __result.putSerializable("infoName", Serializable.class.cast(infoName));
      } else {
        throw new UnsupportedOperationException(InfoEnum.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("infoName")) {
      InfoEnum infoName = (InfoEnum) arguments.get("infoName");
      if (Parcelable.class.isAssignableFrom(InfoEnum.class) || infoName == null) {
        __result.set("infoName", Parcelable.class.cast(infoName));
      } else if (Serializable.class.isAssignableFrom(InfoEnum.class)) {
        __result.set("infoName", Serializable.class.cast(infoName));
      } else {
        throw new UnsupportedOperationException(InfoEnum.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EditAccountFragmentArgs that = (EditAccountFragmentArgs) object;
    if (arguments.containsKey("infoName") != that.arguments.containsKey("infoName")) {
      return false;
    }
    if (getInfoName() != null ? !getInfoName().equals(that.getInfoName()) : that.getInfoName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getInfoName() != null ? getInfoName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditAccountFragmentArgs{"
        + "infoName=" + getInfoName()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull EditAccountFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull InfoEnum infoName) {
      if (infoName == null) {
        throw new IllegalArgumentException("Argument \"infoName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("infoName", infoName);
    }

    @NonNull
    public EditAccountFragmentArgs build() {
      EditAccountFragmentArgs result = new EditAccountFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setInfoName(@NonNull InfoEnum infoName) {
      if (infoName == null) {
        throw new IllegalArgumentException("Argument \"infoName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("infoName", infoName);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public InfoEnum getInfoName() {
      return (InfoEnum) arguments.get("infoName");
    }
  }
}
