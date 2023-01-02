package com.ksds.wetravelsback.config.security.jwt

import com.ksds.wetravelsback.common.util.Sha256Support
import io.jsonwebtoken.*
import io.jsonwebtoken.security.Keys
import io.jsonwebtoken.security.SignatureException
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class JwtTokenProvider(
        val sha256Support: Sha256Support,
        @Value("\${spring.jwt.app_secret}")
        var app_jwt_secret: String,
) {

    val JWT_SECRET = app_jwt_secret

    // Jwt 토큰에서 아이디 추출
    fun getUserIdFromJWT(token: String?): String? {
        var userId: String? = null
        try {
            userId = Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(JWT_SECRET.toByteArray()))
                .build()
                .parseClaimsJws(token)
                .body.subject
        } catch (e: ExpiredJwtException) {
            userId = e.claims.subject
        }

        return userId
    }

    // Jwt 토큰에서 body 추출
    fun getClaimsBodyFromJWT(token: String): Claims {
        return Jwts.parserBuilder()
            .setSigningKey(Keys.hmacShaKeyFor(JWT_SECRET.toByteArray()))
            .build()
            .parseClaimsJws(token)
            .body
    }

    // Jwt 토큰 유효성 검사
    fun validateToken(token: String?): Boolean {
        try {
            Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(JWT_SECRET.toByteArray()))
                .build()
                .parseClaimsJws(token)
            return true
        } catch (ex: SignatureException) { // 404
            println("Invalid JWT signature")
        } catch (ex: MalformedJwtException) { //402
            println("Invalid JWT token")
        } catch (ex: ExpiredJwtException) { // 403
            println("Expired JWT token")
        } catch (ex: UnsupportedJwtException) { // 401
            println("Unsupported JWT token")
        } catch (ex: IllegalArgumentException) {
            println("JWT claims string is empty.")
        }
        return false
    }
}