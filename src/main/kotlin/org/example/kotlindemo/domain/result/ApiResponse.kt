package org.example.kotlindemo.domain.result

import org.springframework.http.ResponseEntity
import java.net.HttpURLConnection

data class Response<T>(
    val code: Int,
    val message: String,
    val data: T?
){
    companion object {
        fun ok(data: Any? = null): ResponseEntity<Response<Any>> {
            return ResponseEntity.ok(
                Response(HttpURLConnection.HTTP_OK, "Success", data)
            )
        }
    }
}
