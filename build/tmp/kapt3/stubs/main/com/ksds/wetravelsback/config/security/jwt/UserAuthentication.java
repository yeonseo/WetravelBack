package com.ksds.wetravelsback.config.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005B-\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/ksds/wetravelsback/config/security/jwt/UserAuthentication;", "Lorg/springframework/security/authentication/UsernamePasswordAuthenticationToken;", "principal", "", "credentials", "(Ljava/lang/String;Ljava/lang/String;)V", "authorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "wetravelsback"})
public final class UserAuthentication extends org.springframework.security.authentication.UsernamePasswordAuthenticationToken {
    
    public UserAuthentication(@org.jetbrains.annotations.Nullable
    java.lang.String principal, @org.jetbrains.annotations.Nullable
    java.lang.String credentials) {
        super(null, null);
    }
    
    public UserAuthentication(@org.jetbrains.annotations.Nullable
    java.lang.String principal, @org.jetbrains.annotations.Nullable
    java.lang.String credentials, @org.jetbrains.annotations.Nullable
    java.util.List<? extends org.springframework.security.core.GrantedAuthority> authorities) {
        super(null, null);
    }
}