package org.example.kotlindemo.web

import org.example.kotlindemo.domain.post.PostCategory
import org.example.kotlindemo.domain.result.ApiResponse
import org.example.kotlindemo.service.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.HttpURLConnection

@RestController
@RequestMapping("/post")
class PostController(private val postService: PostService) {

    @GetMapping
    fun findPostsAndCategories(): ResponseEntity<ApiResponse> {
        val postsAndCategories = postService.findPostsAndCategories()
        return ApiResponse.ok(mapOf("post" to postsAndCategories))
    }

    @PostMapping("/insertCategory")
    fun insertCategory(@RequestBody param: PostCategory): ResponseEntity<Map<String, Any>> {
        val postCategory = PostCategory(
                name = param.name,
                description = param.description,
                createdUser = "admin"
        )

        postService.insertCategory(postCategory);

        val response = mapOf(
                "code" to HttpURLConnection.HTTP_OK,
                "message" to "Success",
        )
        return ResponseEntity.ok(response)
    }


}