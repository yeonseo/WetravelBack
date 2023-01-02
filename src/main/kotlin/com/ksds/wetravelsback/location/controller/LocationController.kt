package com.ksds.wetravelsback.location.controller

import com.ksds.wetravelsback.location.dto.LocationDto
import com.ksds.wetravelsback.location.service.LocationService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Api(value = "Location", tags = ["Location"])
@RestController
@RequestMapping("/main/v1/location")
class LocationController(
        val locationService : LocationService
) {
    @ApiOperation(value="테스트")
    @GetMapping("/test")
    fun getTest(
            city: String?,
    ): ResponseEntity<String?> {
        return ResponseEntity("SUCCESS", HttpStatus.OK)
    }

    @ApiOperation(value="위치 > city 값으로 조회")
    @GetMapping("/list")
    fun getLocationList(
            city: String?,
    ): ResponseEntity<MutableMap<String, Any?>> {
        val res = locationService.getLocationList(city)
        return ResponseEntity(res, HttpStatus.OK)
    }


    @ApiOperation(value="위치 > 추가")
    @PostMapping("/upsert")
    fun approveInvestQual(
            @RequestBody dto: LocationDto.DetailResponse,
    ):  ResponseEntity<Long?> =
            ResponseEntity(locationService.postLocation(dto), HttpStatus.OK)

}