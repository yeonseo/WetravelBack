package com.ksds.wetravelsback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Lcom/ksds/wetravelsback/WebMvcConfig;", "", "()V", "commonsRequestLoggingFilter", "Lcom/ksds/wetravelsback/common/filter/CustomRequestLoggingFilter;", "wetravelsback"})
@org.springframework.context.annotation.Configuration
public class WebMvcConfig {
    
    public WebMvcConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public com.ksds.wetravelsback.common.filter.CustomRequestLoggingFilter commonsRequestLoggingFilter() {
        return null;
    }
}