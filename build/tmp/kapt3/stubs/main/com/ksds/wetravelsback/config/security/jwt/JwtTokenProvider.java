package com.ksds.wetravelsback.config.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;", "", "sha256Support", "Lcom/ksds/wetravelsback/common/util/Sha256Support;", "app_jwt_secret", "", "(Lcom/ksds/wetravelsback/common/util/Sha256Support;Ljava/lang/String;)V", "JWT_SECRET", "getJWT_SECRET", "()Ljava/lang/String;", "getApp_jwt_secret", "setApp_jwt_secret", "(Ljava/lang/String;)V", "getSha256Support", "()Lcom/ksds/wetravelsback/common/util/Sha256Support;", "getClaimsBodyFromJWT", "Lio/jsonwebtoken/Claims;", "token", "getUserIdFromJWT", "validateToken", "", "wetravelsback"})
@org.springframework.stereotype.Component
public class JwtTokenProvider {
    @org.jetbrains.annotations.NotNull
    private final com.ksds.wetravelsback.common.util.Sha256Support sha256Support = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String app_jwt_secret;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String JWT_SECRET = null;
    
    public JwtTokenProvider(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.common.util.Sha256Support sha256Support, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${spring.jwt.app_secret}")
    java.lang.String app_jwt_secret) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.ksds.wetravelsback.common.util.Sha256Support getSha256Support() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getApp_jwt_secret() {
        return null;
    }
    
    public void setApp_jwt_secret(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getJWT_SECRET() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getUserIdFromJWT(@org.jetbrains.annotations.Nullable
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public io.jsonwebtoken.Claims getClaimsBodyFromJWT(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    public boolean validateToken(@org.jetbrains.annotations.Nullable
    java.lang.String token) {
        return false;
    }
}