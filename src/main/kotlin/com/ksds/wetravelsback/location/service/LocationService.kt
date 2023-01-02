package com.ksds.wetravelsback.location.service

import com.ksds.wetravelsback.location.dto.LocationDto
import com.ksds.wetravelsback.location.mapper.LocationMapper
import org.springframework.stereotype.Service

@Service
class LocationService(
        private val locationRepository: LocationRepository,
        private val locationMapper: LocationMapper
) {
    fun getLocationList(city: String?): MutableMap<String, Any?> {
        val resultMap: MutableMap<String, Any?> = mutableMapOf("data" to null)

        resultMap["data"] = locationRepository.findByCity(city)
        return resultMap
    }

    fun postLocation(dto: LocationDto.DetailResponse): Long? {
        val location = locationMapper.toEntity(dto)

        // TODO validation

        val entity = locationRepository.save(location)
        return entity.id
    }
}
