package com.ksds.wetravelsback.config.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/ksds/wetravelsback/config/security/jwt/JwtAuthenticationEntryPoint;", "Lorg/springframework/security/web/AuthenticationEntryPoint;", "()V", "commence", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "e", "Lorg/springframework/security/core/AuthenticationException;", "wetravelsback"})
@org.springframework.stereotype.Component
public class JwtAuthenticationEntryPoint implements org.springframework.security.web.AuthenticationEntryPoint {
    
    public JwtAuthenticationEntryPoint() {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {io.jsonwebtoken.io.IOException.class})
    @java.lang.Override
    public void commence(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull
    org.springframework.security.core.AuthenticationException e) throws io.jsonwebtoken.io.IOException {
    }
}