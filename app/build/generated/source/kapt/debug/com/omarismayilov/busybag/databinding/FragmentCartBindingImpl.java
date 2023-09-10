package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvEmpty, 5);
        sViewsWithIds.put(R.id.btnCheckout, 6);
        sViewsWithIds.put(R.id.textInputLayout, 7);
        sViewsWithIds.put(R.id.etMax, 8);
        sViewsWithIds.put(R.id.divider7, 9);
        sViewsWithIds.put(R.id.textView11, 10);
        sViewsWithIds.put(R.id.rvCart, 11);
        sViewsWithIds.put(R.id.button, 12);
        sViewsWithIds.put(R.id.loadingView, 13);
        sViewsWithIds.put(R.id.materialCardView, 14);
        sViewsWithIds.put(R.id.textView40, 15);
        sViewsWithIds.put(R.id.textView41, 16);
        sViewsWithIds.put(R.id.textView43, 17);
        sViewsWithIds.put(R.id.textView42, 18);
        sViewsWithIds.put(R.id.divider8, 19);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[19]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.airbnb.lottie.LottieAnimationView) bindings[13]
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.textView38.setTag(null);
        this.textView39.setTag(null);
        this.textView44.setTag(null);
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
        if (BR.total == variableId) {
            setTotal((java.lang.Double) variable);
        }
        else if (BR.size == variableId) {
            setSize((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotal(@Nullable java.lang.Double Total) {
        this.mTotal = Total;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.total);
        super.requestRebind();
    }
    public void setSize(@Nullable java.lang.Integer Size) {
        this.mSize = Size;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.size);
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
        java.lang.String textView39AndroidStringItemSizeSize = null;
        java.lang.Double total = mTotal;
        java.lang.String mboundView4AndroidStringPriceDoubleTotalFloat007 = null;
        double totalTotalFloat007 = 0.0;
        double totalFloat007 = 0.0;
        java.lang.String textView38AndroidStringPriceDoubleTotal = null;
        double androidxDatabindingViewDataBindingSafeUnboxTotal = 0.0;
        java.lang.Integer size = mSize;
        java.lang.String textView44AndroidStringPriceDoubleTotalTotalFloat007 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                // read @android:string/price_double
                textView38AndroidStringPriceDoubleTotal = textView38.getResources().getString(R.string.price_double, total);
                // read androidx.databinding.ViewDataBinding.safeUnbox(total)
                androidxDatabindingViewDataBindingSafeUnboxTotal = androidx.databinding.ViewDataBinding.safeUnbox(total);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(total)) * (0.07)
                totalFloat007 = (androidxDatabindingViewDataBindingSafeUnboxTotal) * (0.07);


                // read @android:string/price_double
                mboundView4AndroidStringPriceDoubleTotalFloat007 = mboundView4.getResources().getString(R.string.price_double, totalFloat007);
                // read (androidx.databinding.ViewDataBinding.safeUnbox(total)) + ((androidx.databinding.ViewDataBinding.safeUnbox(total)) * (0.07))
                totalTotalFloat007 = (androidxDatabindingViewDataBindingSafeUnboxTotal) + (totalFloat007);


                // read @android:string/price_double
                textView44AndroidStringPriceDoubleTotalTotalFloat007 = textView44.getResources().getString(R.string.price_double, totalTotalFloat007);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read @android:string/item_size
                textView39AndroidStringItemSizeSize = textView39.getResources().getString(R.string.item_size, size);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mboundView4AndroidStringPriceDoubleTotalFloat007);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView38, textView38AndroidStringPriceDoubleTotal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView44, textView44AndroidStringPriceDoubleTotalTotalFloat007);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView39, textView39AndroidStringItemSizeSize);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): total
        flag 1 (0x2L): size
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}