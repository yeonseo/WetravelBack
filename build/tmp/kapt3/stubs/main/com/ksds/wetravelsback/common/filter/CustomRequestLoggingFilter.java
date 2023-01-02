package com.ksds.wetravelsback.common.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014\u00a8\u0006\n"}, d2 = {"Lcom/ksds/wetravelsback/common/filter/CustomRequestLoggingFilter;", "Lorg/springframework/web/filter/AbstractRequestLoggingFilter;", "()V", "afterRequest", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "message", "", "beforeRequest", "wetravelsback"})
public final class CustomRequestLoggingFilter extends org.springframework.web.filter.AbstractRequestLoggingFilter {
    
    public CustomRequestLoggingFilter() {
        super();
    }
    
    @java.lang.Override
    protected void beforeRequest(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    protected void afterRequest(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}