package com.omarismayilov.busybag.presentation.ui.profile;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.omarismayilov.busybag.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileFragmentToAccountFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_accountFragment);
  }

  @NonNull
  public static NavDirections actionProfileFragmentToOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_orderFragment);
  }
}
