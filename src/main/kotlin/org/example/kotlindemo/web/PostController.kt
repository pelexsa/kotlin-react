package org.example.kotlindemo.web

import org.example.kotlindemo.domain.post.PostCategory
import org.example.kotlindemo.domain.post.PostDto
import org.example.kotlindemo.domain.result.ApiResponse
import org.example.kotlindemo.service.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/post")
class PostController(private val postService: PostService) {

    @GetMapping
    fun findPostsAndCategories(): ResponseEntity<ApiResponse<Any>> {
        val response = mapOf("post" to postService.findPostsAndCategories())
        return ApiResponse.ok(response)
    }

    @PostMapping("/insertCategory")
    fun insertCategory(@RequestBody param: PostCategory): ResponseEntity<ApiResponse<Any>> {
        val postCategory = PostCategory(
            name = param.name,
            description = param.description,
        )

        postService.insertCategory(postCategory)
        return ApiResponse.ok()
    }

    @PutMapping("/updateCategory")
    fun updateCategory(@RequestBody param: PostCategory): ResponseEntity<ApiResponse<Any>> {
        //postService.updateCategory(postCategory)
        return ApiResponse.ok()
    }

    @DeleteMapping("/deleteCategory")
    fun deleteCategory(@RequestParam categoryId: Long): ResponseEntity<ApiResponse<Any>> {
        postService.deleteCategory(categoryId)
        return ApiResponse.ok()
    }


}