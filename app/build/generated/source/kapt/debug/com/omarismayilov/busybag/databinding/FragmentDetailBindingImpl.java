package com.omarismayilov.busybag.databinding;
import com.omarismayilov.busybag.R;
import com.omarismayilov.busybag.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loadingView, 10);
        sViewsWithIds.put(R.id.lyMain, 11);
        sViewsWithIds.put(R.id.constraintLayout2, 12);
        sViewsWithIds.put(R.id.imageButton4, 13);
        sViewsWithIds.put(R.id.ibBack, 14);
        sViewsWithIds.put(R.id.imageButton3, 15);
        sViewsWithIds.put(R.id.nestedScrollView, 16);
        sViewsWithIds.put(R.id.btnAddCart, 17);
        sViewsWithIds.put(R.id.textView26, 18);
        sViewsWithIds.put(R.id.textView16, 19);
        sViewsWithIds.put(R.id.textView17, 20);
        sViewsWithIds.put(R.id.textView19, 21);
        sViewsWithIds.put(R.id.textView20, 22);
        sViewsWithIds.put(R.id.textView21, 23);
        sViewsWithIds.put(R.id.textView22, 24);
        sViewsWithIds.put(R.id.btnFav, 25);
        sViewsWithIds.put(R.id.vpImage, 26);
        sViewsWithIds.put(R.id.springDotsIndicator, 27);
        sViewsWithIds.put(R.id.horizontalScrollView, 28);
        sViewsWithIds.put(R.id.chip10, 29);
        sViewsWithIds.put(R.id.chip9, 30);
        sViewsWithIds.put(R.id.chip8, 31);
        sViewsWithIds.put(R.id.chip7, 32);
        sViewsWithIds.put(R.id.chip6, 33);
        sViewsWithIds.put(R.id.chip5, 34);
        sViewsWithIds.put(R.id.recyclerView, 35);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (android.widget.CheckBox) bindings[25]
            , (com.google.android.material.chip.Chip) bindings[29]
            , (com.google.android.material.chip.Chip) bindings[34]
            , (com.google.android.material.chip.Chip) bindings[33]
            , (com.google.android.material.chip.Chip) bindings[32]
            , (com.google.android.material.chip.Chip) bindings[31]
            , (com.google.android.material.chip.Chip) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.HorizontalScrollView) bindings[28]
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.ImageButton) bindings[13]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.core.widget.NestedScrollView) bindings[16]
            , (android.widget.RatingBar) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[35]
            , (com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator) bindings[27]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[4]
            , (androidx.viewpager2.widget.ViewPager2) bindings[26]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.ratingBar2.setTag(null);
        this.textView13.setTag(null);
        this.textView14.setTag(null);
        this.textView15.setTag(null);
        this.textView18.setTag(null);
        this.textView23.setTag(null);
        this.textView24.setTag(null);
        this.textView25.setTag(null);
        this.textView27.setTag(null);
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
            setProduct((com.omarismayilov.busybag.domain.model.ProductUiModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.omarismayilov.busybag.domain.model.ProductUiModel Product) {
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
        int productStock = 0;
        java.lang.String productCategory = null;
        java.lang.String productFormatPrice = null;
        com.omarismayilov.busybag.domain.model.ProductUiModel product = mProduct;
        int productRating = 0;
        java.lang.String productTitle = null;
        java.lang.String stringValueOfProductRating = null;
        java.lang.String productBrand = null;
        java.lang.String productDescription = null;
        java.lang.String stringValueOfProductStock = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.stock
                    productStock = product.getStock();
                    // read product.category
                    productCategory = product.getCategory();
                    // read product.formatPrice()
                    productFormatPrice = product.formatPrice();
                    // read product.rating
                    productRating = product.getRating();
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.brand
                    productBrand = product.getBrand();
                    // read product.description
                    productDescription = product.getDescription();
                }


                // read String.valueOf(product.stock)
                stringValueOfProductStock = java.lang.String.valueOf(productStock);
                // read String.valueOf(product.rating)
                stringValueOfProductRating = java.lang.String.valueOf(productRating);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.ratingBar2.setProgress(productRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, productTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView14, productTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView15, productFormatPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView18, productDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView23, productBrand);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView24, productCategory);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView25, stringValueOfProductStock);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView27, stringValueOfProductRating);
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