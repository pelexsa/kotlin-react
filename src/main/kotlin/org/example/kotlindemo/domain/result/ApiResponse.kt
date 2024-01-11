package org.example.kotlindemo.domain.result

import org.springframework.http.ResponseEntity
import java.net.HttpURLConnection

data class ApiResponse<T>(
    val code: Int,
    val message: String,
    val data: T?
){
    companion object {
        fun ok(data: Any? = null): ResponseEntity<ApiResponse<Any>> {
            return ResponseEntity.ok(
                ApiResponse(HttpURLConnection.HTTP_OK, "Success", data)
            )
        }
    }
}
