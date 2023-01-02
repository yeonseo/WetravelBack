package com.ksds.wetravelsback.config.security.jwt

import io.jsonwebtoken.Claims
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import java.io.IOException
import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class JwtAuthenticationFilter(
        val jwtTokenProvider: JwtTokenProvider,
) : OncePerRequestFilter() {

    @Throws(ServletException::class, IOException::class)
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain,
    ) {
        try {
            logger.info{"JwtAuthenticationFilter 진입 - ${request.requestURI}"}
            val jwt = getJwtFromRequest(request) //request에서 jwt 토큰을 꺼낸다.
            logger.info{"추출된 jwt : ${jwt}"}
            if (jwt?.isNotEmpty() != null && jwtTokenProvider.validateToken(jwt)) {
                // val userId: String = JwtTokenProvider.getUserIdFromJWT(jwt) //jwt에서 사용자 id를 꺼낸다.
                val claimsBody = jwtTokenProvider.getClaimsBodyFromJWT(jwt)  //jwt body를 가져온다.

                val authorities = grantedAuthorities(claimsBody)

                val authentication = UserAuthentication(claimsBody.subject, null, authorities) //id를 인증한다.
                authentication.details = WebAuthenticationDetailsSource().buildDetails(request) //기본적으로 제공한 details 세팅

                SecurityContextHolder.getContext().authentication = authentication
            } else {
                if (jwt.isNullOrBlank()) {
                    request.setAttribute("unauthorization", "401 인증키 없음.")
                }
                if (jwtTokenProvider.validateToken(jwt)) {
                    request.setAttribute("unauthorization", "401-001 인증키 만료.")
                } else {
                    request.setAttribute("unauthorization", "444 잘못된 토큰")
                }
            }
        } catch (ex: Exception) {
            logger.error("Could not set user authentication in security context", ex)
        }
        filterChain.doFilter(request, response)
    }

    private fun grantedAuthorities(claimsBody: Claims): ArrayList<GrantedAuthority> {
        val authorities = ArrayList<GrantedAuthority>()
        (claimsBody["auth"] as MutableList<*>).forEach { role -> authorities.add(SimpleGrantedAuthority("ROLE_$role")) }

        return authorities
    }

    fun getJwtFromRequest(request: HttpServletRequest): String? {
        val bearerToken = request.getHeader("Authorization")
        return if (bearerToken?.isNotEmpty() != null && bearerToken.startsWith("Bearer ")) {
            bearerToken.substring("Bearer ".length)
        } else null
    }
}