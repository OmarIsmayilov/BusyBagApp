package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditAccountBindingImpl extends FragmentEditAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lyPassword, 8);
        sViewsWithIds.put(R.id.textView54, 9);
        sViewsWithIds.put(R.id.lyPhoneNumber, 10);
        sViewsWithIds.put(R.id.textView53, 11);
        sViewsWithIds.put(R.id.lyEmail, 12);
        sViewsWithIds.put(R.id.textView46, 13);
        sViewsWithIds.put(R.id.textView52, 14);
        sViewsWithIds.put(R.id.textInputLayout4, 15);
        sViewsWithIds.put(R.id.lyBirthday, 16);
        sViewsWithIds.put(R.id.textView50, 17);
        sViewsWithIds.put(R.id.lyGender, 18);
        sViewsWithIds.put(R.id.textView48, 19);
        sViewsWithIds.put(R.id.dropdownMenu, 20);
        sViewsWithIds.put(R.id.divider12, 21);
        sViewsWithIds.put(R.id.btnBack, 22);
        sViewsWithIds.put(R.id.lyName, 23);
        sViewsWithIds.put(R.id.textView51, 24);
        sViewsWithIds.put(R.id.textInputLayout2, 25);
        sViewsWithIds.put(R.id.textView47, 26);
        sViewsWithIds.put(R.id.textInputLayout3, 27);
        sViewsWithIds.put(R.id.btnSave, 28);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEditAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private FragmentEditAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[22]
            , (com.google.android.material.button.MaterialButton) bindings[28]
            , (android.view.View) bindings[21]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.AutoCompleteTextView) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            );
        this.etBirthday.setTag(null);
        this.etEmail.setTag(null);
        this.etFirstName.setTag(null);
        this.etGender.setTag(null);
        this.etLastName.setTag(null);
        this.etNumber.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView49.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.info == variableId) {
            setInfo((com.omarismayilov.busybag.common.InfoEnum) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.omarismayilov.busybag.domain.model.UserUiModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInfo(@Nullable com.omarismayilov.busybag.common.InfoEnum Info) {
        this.mInfo = Info;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.info);
        super.requestRebind();
    }
    public void setUser(@Nullable com.omarismayilov.busybag.domain.model.UserUiModel User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.omarismayilov.busybag.common.InfoEnum info = mInfo;
        java.lang.String userEmail = null;
        java.lang.String userBirthday = null;
        java.lang.String userFirstname = null;
        java.lang.String stringValueOfInfo = null;
        java.lang.String userPhonenumber = null;
        java.lang.String userLastname = null;
        com.omarismayilov.busybag.domain.model.UserUiModel user = mUser;
        java.lang.String userGender = null;

        if ((dirtyFlags & 0x5L) != 0) {



                // read String.valueOf(info)
                stringValueOfInfo = java.lang.String.valueOf(info);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (user != null) {
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.birthday
                    userBirthday = user.getBirthday();
                    // read user.firstname
                    userFirstname = user.getFirstname();
                    // read user.phonenumber
                    userPhonenumber = user.getPhonenumber();
                    // read user.lastname
                    userLastname = user.getLastname();
                    // read user.gender
                    userGender = user.getGender();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.etBirthday.setHint(userBirthday);
            this.etEmail.setHint(userEmail);
            this.etFirstName.setHint(userLastname);
            this.etGender.setHint(userGender);
            this.etLastName.setHint(userFirstname);
            this.etNumber.setHint(userPhonenumber);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView49, stringValueOfInfo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): info
        flag 1 (0x2L): user
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}