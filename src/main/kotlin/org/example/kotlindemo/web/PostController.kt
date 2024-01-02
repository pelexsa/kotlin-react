package org.example.kotlindemo.web

import org.example.kotlindemo.service.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.HttpURLConnection

@RestController
@RequestMapping("/post")
class PostController(private val postService: PostService) {

    @PostMapping
    fun findPosts(): ResponseEntity<Map<String, Any>> {
        val posts = postService.listAllPosts()

        val response = mapOf(
            "code" to HttpURLConnection.HTTP_OK,
            "message" to "Success",
            "data" to mapOf("post" to posts)
        )

        return ResponseEntity.ok(response)
    }


}