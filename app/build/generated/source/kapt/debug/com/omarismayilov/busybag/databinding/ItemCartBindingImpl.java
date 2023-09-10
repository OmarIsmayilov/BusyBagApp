package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCartBindingImpl extends ItemCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ibDelete, 6);
        sViewsWithIds.put(R.id.btnMinus, 7);
        sViewsWithIds.put(R.id.btnPlus, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[6]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.btnFav2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.shapeableImageView2.setTag(null);
        this.textView32.setTag(null);
        this.textView36.setTag(null);
        this.textView55.setTag(null);
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
        if (BR.product == variableId) {
            setProduct((com.omarismayilov.busybag.domain.model.CartUiModel) variable);
        }
        else if (BR.quantity == variableId) {
            setQuantity((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.omarismayilov.busybag.domain.model.CartUiModel Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }
    public void setQuantity(@Nullable java.lang.Integer Quantity) {
        this.mQuantity = Quantity;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.quantity);
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
        int androidxDatabindingViewDataBindingSafeUnboxQuantity = 0;
        java.lang.String stringValueOfQuantity = null;
        java.lang.String textView36AndroidStringPriceProductPrice = null;
        com.omarismayilov.busybag.domain.model.CartUiModel product = mProduct;
        int productPrice = 0;
        java.lang.Integer quantity = mQuantity;
        boolean productFavorite = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (product != null) {
                    // read product.image
                    productImage = product.getImage();
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.price
                    productPrice = product.getPrice();
                    // read product.favorite
                    productFavorite = product.isFavorite();
                }


                // read @android:string/price
                textView36AndroidStringPriceProductPrice = textView36.getResources().getString(R.string.price, productPrice);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(quantity)
                androidxDatabindingViewDataBindingSafeUnboxQuantity = androidx.databinding.ViewDataBinding.safeUnbox(quantity);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(quantity))
                stringValueOfQuantity = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxQuantity);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.btnFav2, productFavorite);
            com.omarismayilov.busybag.common.base.BindingAdapter.loadUrl(this.shapeableImageView2, productImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView32, productTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView36, textView36AndroidStringPriceProductPrice);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView55, stringValueOfQuantity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): quantity
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}