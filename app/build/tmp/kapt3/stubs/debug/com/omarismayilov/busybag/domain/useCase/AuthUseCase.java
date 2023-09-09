package com.omarismayilov.busybag.domain.useCase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;", "", "repository", "Lcom/omarismayilov/busybag/domain/repository/AuthRepository;", "(Lcom/omarismayilov/busybag/domain/repository/AuthRepository;)V", "getRepository", "()Lcom/omarismayilov/busybag/domain/repository/AuthRepository;", "addUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "", "userUiModel", "Lcom/omarismayilov/busybag/domain/model/UserUiModel;", "getUser", "Lcom/google/firebase/auth/FirebaseUser;", "login", "Lcom/google/firebase/auth/AuthResult;", "email", "", "password", "logout", "register", "app_debug"})
public final class AuthUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.repository.AuthRepository repository = null;
    
    @javax.inject.Inject
    public AuthUseCase(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.repository.AuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.domain.repository.AuthRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.google.firebase.auth.AuthResult>> login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.google.firebase.auth.AuthResult>> register(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.lang.Boolean>> logout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.google.firebase.auth.FirebaseUser>> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.lang.Boolean>> addUser(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.UserUiModel userUiModel) {
        return null;
    }
}