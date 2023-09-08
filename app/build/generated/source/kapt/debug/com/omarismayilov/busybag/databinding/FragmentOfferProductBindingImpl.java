package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOfferProductBindingImpl extends FragmentOfferProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lyError, 5);
        sViewsWithIds.put(R.id.textView12, 6);
        sViewsWithIds.put(R.id.constraintLayout, 7);
        sViewsWithIds.put(R.id.linearLayout8, 8);
        sViewsWithIds.put(R.id.ibBack, 9);
        sViewsWithIds.put(R.id.rvProduct, 10);
        sViewsWithIds.put(R.id.divider2, 11);
        sViewsWithIds.put(R.id.loading, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOfferProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentOfferProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.view.View) bindings[11]
            , (android.widget.ImageButton) bindings[9]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (com.airbnb.lottie.LottieAnimationView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivOffer.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView11.setTag(null);
        this.tvDiscount.setTag(null);
        this.tvOffer.setTag(null);
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
        if (BR.offer == variableId) {
            setOffer((com.omarismayilov.busybag.domain.model.OfferUiModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOffer(@Nullable com.omarismayilov.busybag.domain.model.OfferUiModel Offer) {
        this.mOffer = Offer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.offer);
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
        com.omarismayilov.busybag.domain.model.OfferUiModel offer = mOffer;
        java.lang.String offerTitle = null;
        java.lang.String offerDiscount = null;
        java.lang.String offerThumbnailUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (offer != null) {
                    // read offer.title
                    offerTitle = offer.getTitle();
                    // read offer.discount()
                    offerDiscount = offer.discount();
                    // read offer.thumbnailUrl
                    offerThumbnailUrl = offer.getThumbnailUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.omarismayilov.busybag.common.base.BindingAdapter.loadUrl(this.ivOffer, offerThumbnailUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, offerTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDiscount, offerDiscount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOffer, offerTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): offer
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}