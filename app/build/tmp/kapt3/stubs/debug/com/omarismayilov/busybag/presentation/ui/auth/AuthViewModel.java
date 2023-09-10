package com.omarismayilov.busybag.presentation.ui.auth;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0013J\u001e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/omarismayilov/busybag/presentation/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authUseCase", "Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;", "sp", "Lcom/omarismayilov/movaapp/common/utils/SharedPrefManager;", "(Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;Lcom/omarismayilov/movaapp/common/utils/SharedPrefManager;)V", "_authState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/omarismayilov/busybag/presentation/ui/auth/AuthUiState;", "authState", "Landroidx/lifecycle/LiveData;", "getAuthState", "()Landroidx/lifecycle/LiveData;", "getAuthUseCase", "()Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;", "getSp", "()Lcom/omarismayilov/movaapp/common/utils/SharedPrefManager;", "addUser", "", "userUiModel", "Lcom/omarismayilov/busybag/domain/model/UserUiModel;", "loginUser", "email", "", "password", "logoutUser", "registerUser", "user", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.useCase.AuthUseCase authUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.movaapp.common.utils.SharedPrefManager sp = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.omarismayilov.busybag.presentation.ui.auth.AuthUiState> _authState = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.useCase.AuthUseCase authUseCase, @org.jetbrains.annotations.NotNull
    com.omarismayilov.movaapp.common.utils.SharedPrefManager sp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.domain.useCase.AuthUseCase getAuthUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.movaapp.common.utils.SharedPrefManager getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.omarismayilov.busybag.presentation.ui.auth.AuthUiState> getAuthState() {
        return null;
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
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
}