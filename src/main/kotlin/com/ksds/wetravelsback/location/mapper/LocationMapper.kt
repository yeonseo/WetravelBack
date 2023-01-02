package com.ksds.wetravelsback.location.mapper

import com.ksds.wetravelsback.common.EntityMapper
import com.ksds.wetravelsback.location.dto.LocationDto
import com.ksds.wetravelsback.location.entity.Location
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface LocationMapper : EntityMapper<LocationDto.DetailResponse, Location> {
    override fun toDto(entity: Location): LocationDto.DetailResponse
}