package com.example.musify.data.remote.token.tokenmanager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/musify/data/remote/token/tokenmanager/TokenManager;", "", "getNewAccessToken", "Lcom/example/musify/data/remote/token/AccessTokenResponse;", "secret", "", "grantType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TokenManager {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/token")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object getNewAccessToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "grant_type")
    java.lang.String grantType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.token.AccessTokenResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}