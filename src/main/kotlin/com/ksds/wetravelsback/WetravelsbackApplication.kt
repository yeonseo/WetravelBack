package com.ksds.wetravelsback

import com.ksds.wetravelsback.common.filter.CustomRequestLoggingFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class WetravelsbackApplication

fun main(args: Array<String>) {
	runApplication<WetravelsbackApplication>(*args)
}

@Configuration
class WebMvcConfig {
	@Bean
	fun  commonsRequestLoggingFilter(): CustomRequestLoggingFilter {
		val filter = CustomRequestLoggingFilter();
		filter.setIncludeClientInfo(true); //클라이언트 주소와 세션 ID를 로그에 출력
		filter.setIncludeHeaders(true); //헤더정보를 로그에 출력
		filter.setIncludeQueryString(true); //queryString을 로그에 출력
		filter.setIncludePayload(true); //body request 내용을 로그에 출력
		filter.setMaxPayloadLength(2000);	//로그에 포함할 body request 사이즈 제한
		return filter;
	}
}