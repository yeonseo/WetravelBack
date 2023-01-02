package com.ksds.wetravelsback.common.util

import org.springframework.stereotype.Component
import java.security.MessageDigest
import kotlin.experimental.and

@Component
class Sha256Support {

    @Throws(Exception::class)
    fun encryptPasswordBySha256(password: String): String {
        val encoder = MessageDigest.getInstance("SHA-256")
        val byteArray = encoder.digest(password.toByteArray())

        val encryptedPassword = StringBuffer()
        for (byte in byteArray) {
            val hashedByte = (byte.and(0xff.toByte()) + 0x100).toString(16)
            if (hashedByte.length > 2)
                encryptedPassword.append(hashedByte.substring(1))
            else
                encryptedPassword.append(hashedByte)
        }
        return encryptedPassword.toString()
    }
}