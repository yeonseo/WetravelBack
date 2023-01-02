package com.ksds.wetravelsback.location.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ksds/wetravelsback/location/service/LocationService;", "", "locationRepository", "Lcom/ksds/wetravelsback/location/service/LocationRepository;", "locationMapper", "Lcom/ksds/wetravelsback/location/mapper/LocationMapper;", "(Lcom/ksds/wetravelsback/location/service/LocationRepository;Lcom/ksds/wetravelsback/location/mapper/LocationMapper;)V", "getLocationList", "", "", "city", "postLocation", "", "dto", "Lcom/ksds/wetravelsback/location/dto/LocationDto$DetailResponse;", "(Lcom/ksds/wetravelsback/location/dto/LocationDto$DetailResponse;)Ljava/lang/Long;", "wetravelsback"})
@org.springframework.stereotype.Service
public class LocationService {
    private final com.ksds.wetravelsback.location.service.LocationRepository locationRepository = null;
    private final com.ksds.wetravelsback.location.mapper.LocationMapper locationMapper = null;
    
    public LocationService(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.location.service.LocationRepository locationRepository, @org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.location.mapper.LocationMapper locationMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Map<java.lang.String, java.lang.Object> getLocationList(@org.jetbrains.annotations.Nullable
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long postLocation(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.location.dto.LocationDto.DetailResponse dto) {
        return null;
    }
}