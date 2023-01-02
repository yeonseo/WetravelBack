package com.ksds.wetravelsback.config.security.jwt

import io.jsonwebtoken.io.IOException
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class JwtAuthenticationEntryPoint : AuthenticationEntryPoint {
    @Throws(IOException::class)
    override fun commence(
        request: HttpServletRequest,
        response: HttpServletResponse,
        e: AuthenticationException,
    ) {
        // 유효한 자격증명을 제공하지 않고 접근하려 할때 401
        request.setAttribute("response.failure.code", "unauthorization.code")
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED)
    }
}