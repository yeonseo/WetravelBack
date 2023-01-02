package com.ksds.wetravelsback.config.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ksds/wetravelsback/config/security/SecurityConfig;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "jwtTokenProvider", "Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;", "(Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;)V", "configure", "", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "web", "Lorg/springframework/security/config/annotation/web/builders/WebSecurity;", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "wetravelsback"})
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class SecurityConfig extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    private final com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    
    public SecurityConfig(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider jwtTokenProvider) {
        super();
    }
    
    @java.lang.Override
    public void configure(@org.jetbrains.annotations.Nullable
    org.springframework.security.config.annotation.web.builders.WebSecurity web) {
    }
    
    @java.lang.Override
    protected void configure(@org.jetbrains.annotations.Nullable
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
}