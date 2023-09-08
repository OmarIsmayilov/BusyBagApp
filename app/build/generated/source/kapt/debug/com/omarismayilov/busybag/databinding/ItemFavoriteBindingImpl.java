package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFavoriteBindingImpl extends ItemFavoriteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout7, 7);
        sViewsWithIds.put(R.id.ibDelete, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFavoriteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemFavoriteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.RatingBar) bindings[6]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.ratingBar.setTag(null);
        this.shapeableImageView.setTag(null);
        this.textView10.setTag(null);
        this.textView7.setTag(null);
        this.textView8.setTag(null);
        this.textView9.setTag(null);
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
        if (BR.product == variableId) {
            setProduct((com.omarismayilov.busybag.domain.model.FavoriteUiModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.omarismayilov.busybag.domain.model.FavoriteUiModel Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
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
        java.lang.String productImage = null;
        java.lang.String productTitle = null;
        java.lang.String productFormatPrice = null;
        com.omarismayilov.busybag.domain.model.FavoriteUiModel product = mProduct;
        java.lang.String productFormatDiscount = null;
        int productRating = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.image
                    productImage = product.getImage();
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.formatPrice()
                    productFormatPrice = product.formatPrice();
                    // read product.formatDiscount()
                    productFormatDiscount = product.formatDiscount();
                    // read product.rating
                    productRating = product.getRating();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.ratingBar.setProgress(productRating);
            com.omarismayilov.busybag.common.base.BindingAdapter.loadUrl(this.shapeableImageView, productImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView10, productFormatDiscount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView7, productTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, productFormatPrice);
            com.omarismayilov.busybag.common.base.BindingAdapter.setFavPrice(this.textView9, product);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}