package com.ksds.wetravelsback.common.util

import com.ksds.wetravelsback.config.security.jwt.JwtAuthenticationFilter
import com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider
import org.springframework.stereotype.Service
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes
import javax.servlet.http.HttpServletRequest

@Service
class SessionUtil(
        private val jwtAuthenticationFilter: JwtAuthenticationFilter,
        private val jwtTokenProvider: JwtTokenProvider,
) {

    /**
     * jwt 를 조회하여 payload 에 저장된 memberId 값을 가져옵니다.
     */
    fun getMemberId(): String? {
        val request: HttpServletRequest =
            (RequestContextHolder.getRequestAttributes() as ServletRequestAttributes).request

        return jwtTokenProvider.getUserIdFromJWT(jwtAuthenticationFilter.getJwtFromRequest(request))
    }
}