package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountBindingImpl extends FragmentAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btnLogout, 7);
        sViewsWithIds.put(R.id.btnBack, 8);
        sViewsWithIds.put(R.id.textView48, 9);
        sViewsWithIds.put(R.id.divider11, 10);
        sViewsWithIds.put(R.id.constraintLayout7, 11);
        sViewsWithIds.put(R.id.shapeableImageView3, 12);
        sViewsWithIds.put(R.id.linearLayout9, 13);
        sViewsWithIds.put(R.id.lyGender, 14);
        sViewsWithIds.put(R.id.imageView4, 15);
        sViewsWithIds.put(R.id.imageView6, 16);
        sViewsWithIds.put(R.id.lyBirthday, 17);
        sViewsWithIds.put(R.id.imageView5, 18);
        sViewsWithIds.put(R.id.imageView11, 19);
        sViewsWithIds.put(R.id.lyEmail, 20);
        sViewsWithIds.put(R.id.imageView12, 21);
        sViewsWithIds.put(R.id.imageView10, 22);
        sViewsWithIds.put(R.id.lyNumber, 23);
        sViewsWithIds.put(R.id.textView53, 24);
        sViewsWithIds.put(R.id.imageView7, 25);
        sViewsWithIds.put(R.id.imageView8, 26);
        sViewsWithIds.put(R.id.lyPassword, 27);
        sViewsWithIds.put(R.id.textView52, 28);
        sViewsWithIds.put(R.id.imageView3, 29);
        sViewsWithIds.put(R.id.imageView9, 30);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.view.View) bindings[10]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.LinearLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.textView50.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.user == variableId) {
            setUser((com.omarismayilov.busybag.domain.model.UserUiModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.omarismayilov.busybag.domain.model.UserUiModel User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        java.lang.String userFullName = null;
        java.lang.String userEmail = null;
        java.lang.String userBirthday = null;
        java.lang.String userPhonenumber = null;
        com.omarismayilov.busybag.domain.model.UserUiModel user = mUser;
        java.lang.String userGender = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.fullName()
                    userFullName = user.fullName();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.birthday
                    userBirthday = user.getBirthday();
                    // read user.phonenumber
                    userPhonenumber = user.getPhonenumber();
                    // read user.gender
                    userGender = user.getGender();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userGender);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userBirthday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userPhonenumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView50, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, userFullName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}