package com.ksds.wetravelsback.location.service

import com.ksds.wetravelsback.location.entity.Location
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LocationRepository : JpaRepository<Location?, Long?> {
    fun findByCity(city: String?): List<Location?>
}