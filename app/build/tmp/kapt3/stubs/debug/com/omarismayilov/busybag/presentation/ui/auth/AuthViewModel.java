package com.omarismayilov.busybag.presentation.ui.auth;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0011J\u0016\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/omarismayilov/busybag/presentation/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authUseCase", "Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;", "sp", "Lcom/omarismayilov/movaapp/common/utils/SharedPrefManager;", "(Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;Lcom/omarismayilov/movaapp/common/utils/SharedPrefManager;)V", "_authState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/omarismayilov/busybag/domain/AppUiState;", "authState", "Landroidx/lifecycle/LiveData;", "getAuthState", "()Landroidx/lifecycle/LiveData;", "addUser", "", "userUiModel", "Lcom/omarismayilov/busybag/domain/model/UserUiModel;", "getUserInfo", "loginUser", "email", "", "password", "logoutUser", "registerUser", "user", "updateUser", "info", "Lcom/omarismayilov/busybag/common/InfoEnum;", "updatedData", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.useCase.AuthUseCase authUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.movaapp.common.utils.SharedPrefManager sp = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.omarismayilov.busybag.domain.AppUiState> _authState = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.useCase.AuthUseCase authUseCase, @org.jetbrains.annotations.NotNull
    com.omarismayilov.movaapp.common.utils.SharedPrefManager sp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.omarismayilov.busybag.domain.AppUiState> getAuthState() {
        return null;
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.common.InfoEnum info, @org.jetbrains.annotations.NotNull
    java.lang.String updatedData) {
    }
    
    private final void addUser(com.omarismayilov.busybag.domain.model.UserUiModel userUiModel) {
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.UserUiModel user) {
    }
    
    public final void logoutUser() {
    }
    
    public final void getUserInfo() {
    }
}