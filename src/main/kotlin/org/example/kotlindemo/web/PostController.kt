package org.example.kotlindemo.web

import org.example.kotlindemo.domain.post.PostCategory
import org.example.kotlindemo.domain.result.Response
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
    fun findPostsAndCategories(): ResponseEntity<Response<Any>> {
        val posts = postService.findPostsAndCategories()
        return Response.ok(posts)
    }

    @PostMapping("/insertCategory")
    fun insertCategory(@RequestBody param: PostCategory): ResponseEntity<Response<Any>> {
        val postCategory = PostCategory(
            name = param.name,
            description = param.description,
        )

        postService.insertCategory(postCategory)
        return Response.ok()
    }

    @PutMapping("/updateCategory")
    fun updateCategory(@RequestBody param: PostCategory): ResponseEntity<Response<Any>> {
        //postService.updateCategory(postCategory)
        return Response.ok()
    }

    @DeleteMapping("/deleteCategory")
    fun deleteCategory(@RequestParam categoryId: Long): ResponseEntity<Response<Any>> {
        postService.deleteCategory(categoryId)
        return Response.ok()
    }


}