package com.ksds.wetravelsback.location.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J&\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017J\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ksds/wetravelsback/location/controller/LocationController;", "", "locationService", "Lcom/ksds/wetravelsback/location/service/LocationService;", "(Lcom/ksds/wetravelsback/location/service/LocationService;)V", "getLocationService", "()Lcom/ksds/wetravelsback/location/service/LocationService;", "approveInvestQual", "Lorg/springframework/http/ResponseEntity;", "", "dto", "Lcom/ksds/wetravelsback/location/dto/LocationDto$DetailResponse;", "getLocationList", "", "", "city", "getTest", "wetravelsback"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/main/v1/location"})
@org.springframework.web.bind.annotation.RestController
@io.swagger.annotations.Api(value = "Location", tags = {"Location"})
public class LocationController {
    @org.jetbrains.annotations.NotNull
    private final com.ksds.wetravelsback.location.service.LocationService locationService = null;
    
    public LocationController(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.location.service.LocationService locationService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.ksds.wetravelsback.location.service.LocationService getLocationService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/test"})
    @io.swagger.annotations.ApiOperation(value = "\ud14c\uc2a4\ud2b8")
    public org.springframework.http.ResponseEntity<java.lang.String> getTest(@org.jetbrains.annotations.Nullable
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/list"})
    @io.swagger.annotations.ApiOperation(value = "\uc704\uce58 > city \uac12\uc73c\ub85c \uc870\ud68c")
    public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> getLocationList(@org.jetbrains.annotations.Nullable
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/upsert"})
    @io.swagger.annotations.ApiOperation(value = "\uc704\uce58 > \ucd94\uac00")
    public org.springframework.http.ResponseEntity<java.lang.Long> approveInvestQual(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.ksds.wetravelsback.location.dto.LocationDto.DetailResponse dto) {
        return null;
    }
}