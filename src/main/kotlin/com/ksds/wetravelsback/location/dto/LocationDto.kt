package com.ksds.wetravelsback.location.dto

class LocationDto {
    data class DetailResponse(
            var id: Long,
            var city: String? = null
    )
}
