package com.ksds.wetravelsback.location.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u001a\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/ksds/wetravelsback/location/service/LocationRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/ksds/wetravelsback/location/entity/Location;", "", "findByCity", "", "city", "", "wetravelsback"})
@org.springframework.stereotype.Repository
public abstract interface LocationRepository extends org.springframework.data.jpa.repository.JpaRepository<com.ksds.wetravelsback.location.entity.Location, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.ksds.wetravelsback.location.entity.Location> findByCity(@org.jetbrains.annotations.Nullable
    java.lang.String city);
}