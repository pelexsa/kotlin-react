package org.example.kotlindemo.domain.result

import org.springframework.http.ResponseEntity
import java.net.HttpURLConnection

data class ApiResponse(
        var code: Int,
        var message: String,
        var data: Any? = null
){
    companion object {
        fun ok(data: Any? = null) = ResponseEntity.ok(
                ApiResponse(code = HttpURLConnection.HTTP_OK,
                    message = "Success",
                    data = data)
        )
    }

}
