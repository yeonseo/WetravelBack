package com.ksds.wetravelsback.location.mapper;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ksds/wetravelsback/location/mapper/LocationMapper;", "Lcom/ksds/wetravelsback/common/EntityMapper;", "Lcom/ksds/wetravelsback/location/dto/LocationDto$DetailResponse;", "Lcom/ksds/wetravelsback/location/entity/Location;", "toDto", "entity", "wetravelsback"})
public abstract interface LocationMapper extends com.ksds.wetravelsback.common.EntityMapper<com.ksds.wetravelsback.location.dto.LocationDto.DetailResponse, com.ksds.wetravelsback.location.entity.Location> {
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public abstract com.ksds.wetravelsback.location.dto.LocationDto.DetailResponse toDto(@org.jetbrains.annotations.NotNull
    com.ksds.wetravelsback.location.entity.Location entity);
}