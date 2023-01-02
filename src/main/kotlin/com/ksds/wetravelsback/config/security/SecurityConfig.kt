package com.ksds.wetravelsback.config.security

import com.ksds.wetravelsback.config.security.jwt.JwtAccessDeniedHandler
import com.ksds.wetravelsback.config.security.jwt.JwtAuthenticationEntryPoint
import com.ksds.wetravelsback.config.security.jwt.JwtAuthenticationFilter
import com.ksds.wetravelsback.config.security.jwt.JwtTokenProvider
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource


@Configuration
@EnableWebSecurity
class SecurityConfig(
//        private val jwtAuthenticationFilter: JwtAuthenticationFilter,
        private val jwtTokenProvider: JwtTokenProvider,
//        private val jwtAuthenticationEntryPoint: JwtAuthenticationEntryPoint,
//        private val jwtAccessDeniedHandler: JwtAccessDeniedHandler,
) : WebSecurityConfigurerAdapter() {

    override fun configure(web: WebSecurity?) {

        //StaticResourceLocation, 정적 파일 보안 filter, permitAll 과는 조금 다름.
        web!!.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations())
    }

    override fun configure(http: HttpSecurity?) {

        http!!
                .httpBasic().disable() // rest api만 고려, 기본 설정 해제
                .csrf().disable() // csrf 보안 토큰 disable 처리
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 토큰 기반 인증이므로 세션 사용 안함
                .and()
                .authorizeRequests() // 요청에 대한 사용권한 체크
//                .antMatchers("/api/**").authenticated()
//                .antMatchers("/register/**", "/login/**", "/logout/**").permitAll() // 비로그인 접근가능
                .antMatchers("/**").permitAll() // 테스트 시, 모두 오픈
                .and()
                .addFilterBefore(JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter::class.java)
    }

    /*
    * cors filter 설정
    * */
    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource = UrlBasedCorsConfigurationSource().also { cors ->
        CorsConfiguration().apply {
            // allowedOrigins = listOf("*")
            allowedOriginPatterns = listOf("*")
            allowedMethods = listOf("POST", "PUT", "DELETE", "GET", "OPTIONS", "HEAD")
            allowedHeaders = listOf(
                    "Authorization",
                    "Content-Type",
                    "X-Requested-With",
                    "Accept",
                    "Origin",
                    "Access-Control-Request-Method",
                    "Access-Control-Request-Headers"
            )
            exposedHeaders =
                    listOf(
                            "Access-Control-Allow-Origin",
                            "Access-Control-Allow-Credentials",
                            "Authorization",
                            "Content-Disposition"
                    )
            allowCredentials = true
            maxAge = 3600
            cors.registerCorsConfiguration("/**", this)
        }
    }
}