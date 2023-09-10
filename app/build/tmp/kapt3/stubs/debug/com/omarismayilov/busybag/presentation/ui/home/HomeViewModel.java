package com.omarismayilov.busybag.presentation.ui.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/omarismayilov/busybag/presentation/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getCategoryUseCase", "Lcom/omarismayilov/busybag/domain/useCase/GetCategoryUseCase;", "getOfferUseCase", "Lcom/omarismayilov/busybag/domain/useCase/GetOfferUseCase;", "getProductByCategoryUseCase", "Lcom/omarismayilov/busybag/domain/useCase/GetProductByCategoryUseCase;", "(Lcom/omarismayilov/busybag/domain/useCase/GetCategoryUseCase;Lcom/omarismayilov/busybag/domain/useCase/GetOfferUseCase;Lcom/omarismayilov/busybag/domain/useCase/GetProductByCategoryUseCase;)V", "_homeState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/omarismayilov/busybag/domain/AppUiState;", "homeState", "Landroidx/lifecycle/LiveData;", "getHomeState", "()Landroidx/lifecycle/LiveData;", "getCategories", "", "getOffers", "getPopular", "getRecommend", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase getCategoryUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.useCase.GetOfferUseCase getOfferUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.useCase.GetProductByCategoryUseCase getProductByCategoryUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.omarismayilov.busybag.domain.AppUiState> _homeState = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase getCategoryUseCase, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.useCase.GetOfferUseCase getOfferUseCase, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.useCase.GetProductByCategoryUseCase getProductByCategoryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.omarismayilov.busybag.domain.AppUiState> getHomeState() {
        return null;
    }
    
    private final void getRecommend() {
    }
    
    private final void getPopular() {
    }
    
    public final void getOffers() {
    }
    
    private final void getCategories() {
    }
}