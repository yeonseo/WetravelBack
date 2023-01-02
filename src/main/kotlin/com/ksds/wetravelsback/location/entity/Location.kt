package com.ksds.wetravelsback.location.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.jetbrains.annotations.NotNull
import javax.persistence.*


@Entity
@Table(name = "location")
class Location() {
    @Id
    @GeneratedValue
    var id: Long? = null

    @NotNull
    var country: String? = null // 국가

    @NotNull
    var region: String? = null // 도

    @NotNull
    var city: String? = null // 시
}