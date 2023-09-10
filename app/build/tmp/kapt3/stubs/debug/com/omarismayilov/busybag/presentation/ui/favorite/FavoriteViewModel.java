package com.omarismayilov.busybag.presentation.ui.favorite;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/omarismayilov/busybag/presentation/ui/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "favoriteUseCase", "Lcom/omarismayilov/busybag/domain/useCase/local/FavoriteUseCase;", "(Lcom/omarismayilov/busybag/domain/useCase/local/FavoriteUseCase;)V", "_favState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/omarismayilov/busybag/presentation/ui/favorite/FavoriteUiState;", "favState", "Landroidx/lifecycle/LiveData;", "getFavState", "()Landroidx/lifecycle/LiveData;", "deleteFav", "", "product", "Lcom/omarismayilov/busybag/domain/model/FavoriteUiModel;", "getFav", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.useCase.local.FavoriteUseCase favoriteUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.omarismayilov.busybag.presentation.ui.favorite.FavoriteUiState> _favState = null;
    
    @javax.inject.Inject
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.useCase.local.FavoriteUseCase favoriteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.omarismayilov.busybag.presentation.ui.favorite.FavoriteUiState> getFavState() {
        return null;
    }
    
    private final void getFav() {
    }
    
    public final void deleteFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.FavoriteUiModel product) {
    }
}