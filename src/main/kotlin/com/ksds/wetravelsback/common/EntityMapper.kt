package com.ksds.wetravelsback.common

interface EntityMapper<D, E> {
    fun toEntity(dto: D): E
    fun toDto(entity: E): D
}