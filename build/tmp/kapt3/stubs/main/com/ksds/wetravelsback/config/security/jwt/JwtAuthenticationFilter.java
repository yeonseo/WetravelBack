package com.ksds.wetravelsback.config.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/ksds/wetravelsback/config/security/jwt/JwtAuthenticationFilter;", "Lorg/springframework/web/filter/OncePerRequestFilter;", "jwtTokenProvider", "Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;", "(Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;)V", "getJwtTokenProvider", "()Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;", "doFilterInternal", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "filterChain", "Ljavax/servlet/FilterChain;", "getJwtFromRequest", "", "grantedAuthorities", "Ljava/util/ArrayList;", "Lorg/springframework/security/core/GrantedAuthority;", "Lkotlin/collections/ArrayList;", "claimsBody", "Lio/jsonwebtoken/Claims;", "wetravelsback"})
@org.springframework.stereotype.Component
public class JwtAuthenticationFilter extends org.springframework.web.filter.OncePerRequestFilter {
    @org.jetbrains.annotations.NotNull
    private final com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    
    public JwtAuthenticationFilter(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider jwtTokenProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider getJwtTokenProvider() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {javax.servlet.ServletException.class, java.io.IOException.class})
    @java.lang.Override
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull
    javax.servlet.FilterChain filterChain) throws javax.servlet.ServletException, java.io.IOException {
    }
    
    private java.util.ArrayList<org.springframework.security.core.GrantedAuthority> grantedAuthorities(io.jsonwebtoken.Claims claimsBody) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getJwtFromRequest(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}