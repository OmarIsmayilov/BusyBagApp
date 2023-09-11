package com.omarismayilov.busybag.domain.useCase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J-\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/omarismayilov/busybag/domain/useCase/AuthUseCase;", "", "repository", "Lcom/omarismayilov/busybag/domain/repository/AuthRepository;", "(Lcom/omarismayilov/busybag/domain/repository/AuthRepository;)V", "getRepository", "()Lcom/omarismayilov/busybag/domain/repository/AuthRepository;", "addUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "", "userUiModel", "Lcom/omarismayilov/busybag/domain/model/UserUiModel;", "(Lcom/omarismayilov/busybag/domain/model/UserUiModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/google/firebase/auth/AuthResult;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "register", "updateUser", "info", "Lcom/omarismayilov/busybag/common/InfoEnum;", "updatedData", "(Lcom/omarismayilov/busybag/common/InfoEnum;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends com.google.firebase.auth.AuthResult>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends com.google.firebase.auth.AuthResult>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<java.lang.Boolean>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.domain.model.UserUiModel>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addUser(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.UserUiModel userUiModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<java.lang.Boolean>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.common.InfoEnum info, @org.jetbrains.annotations.NotNull
    java.lang.String updatedData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<java.lang.Boolean>>> $completion) {
        return null;
    }
}