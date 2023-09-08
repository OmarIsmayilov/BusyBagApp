package com.omarismayilov.busybag.presentation.ui.explore.productList;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0016\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020\u0015H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/omarismayilov/busybag/presentation/ui/explore/productList/ProductListFragment;", "Lcom/omarismayilov/busybag/common/base/BaseFragment;", "Lcom/omarismayilov/busybag/databinding/FragmentProductListBinding;", "()V", "args", "Lcom/omarismayilov/busybag/presentation/ui/explore/productList/ProductListFragmentArgs;", "getArgs", "()Lcom/omarismayilov/busybag/presentation/ui/explore/productList/ProductListFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "mCategory", "", "productAdapter", "Lcom/omarismayilov/busybag/presentation/ui/offer/adapter/ProductAdapter;", "viewModel", "Lcom/omarismayilov/busybag/presentation/ui/explore/ExploreViewModel;", "getViewModel", "()Lcom/omarismayilov/busybag/presentation/ui/explore/ExploreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleState", "", "it", "Lcom/omarismayilov/busybag/presentation/ui/explore/ExploreUiState;", "initSpinner", "observeEvents", "onCreateFinish", "setAdapter", "setProductData", "data", "", "Lcom/omarismayilov/busybag/domain/model/ProductUiModel;", "setupListeners", "app_debug"})
public final class ProductListFragment extends com.omarismayilov.busybag.common.base.BaseFragment<com.omarismayilov.busybag.databinding.FragmentProductListBinding> {
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.presentation.ui.offer.adapter.ProductAdapter productAdapter = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String mCategory = "";
    
    public ProductListFragment() {
        super(null);
    }
    
    private final com.omarismayilov.busybag.presentation.ui.explore.productList.ProductListFragmentArgs getArgs() {
        return null;
    }
    
    private final com.omarismayilov.busybag.presentation.ui.explore.ExploreViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void observeEvents() {
    }
    
    @java.lang.Override
    protected void onCreateFinish() {
    }
    
    private final void initSpinner() {
    }
    
    private final void setAdapter() {
    }
    
    @java.lang.Override
    protected void setupListeners() {
    }
    
    private final void handleState(com.omarismayilov.busybag.presentation.ui.explore.ExploreUiState it) {
    }
    
    private final void setProductData(java.util.List<com.omarismayilov.busybag.domain.model.ProductUiModel> data) {
    }
}