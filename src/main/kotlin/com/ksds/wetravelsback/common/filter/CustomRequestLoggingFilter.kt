package com.ksds.wetravelsback.common.filter

import org.springframework.web.filter.AbstractRequestLoggingFilter
import javax.servlet.http.HttpServletRequest

class CustomRequestLoggingFilter: AbstractRequestLoggingFilter() {

    override fun beforeRequest(request: HttpServletRequest, message: String) {
        if (!message.contains("/main/v1/healthCheck")) {
            logger.info(message)
        }
    }

    override fun afterRequest(request: HttpServletRequest, message: String) {
        if (!message.contains("/main/v1/healthCheck")) {
            logger.info(message)
        }
    }
}