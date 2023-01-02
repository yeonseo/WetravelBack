package com.ksds.wetravelsback.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ksds/wetravelsback/common/util/SessionUtil;", "", "jwtAuthenticationFilter", "Lcom/ksds/wetravelsback/config/security/jwt/JwtAuthenticationFilter;", "jwtTokenProvider", "Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;", "(Lcom/ksds/wetravelsback/config/security/jwt/JwtAuthenticationFilter;Lcom/ksds/wetravelsback/config/security/jwt/JwtTokenProvider;)V", "getMemberId", "", "wetravelsback"})
@org.springframework.stereotype.Service
public class SessionUtil {
    private final com.ksds.wetravelsback.config.security.jwt.JwtAuthenticationFilter jwtAuthenticationFilter = null;
    private final com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    
    public SessionUtil(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.config.security.jwt.JwtAuthenticationFilter jwtAuthenticationFilter, @org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider jwtTokenProvider) {
        super();
    }
    
    /**
     * jwt 를 조회하여 payload 에 저장된 memberId 값을 가져옵니다.
     */
    @org.jetbrains.annotations.Nullable
    public java.lang.String getMemberId() {
        return null;
    }
}