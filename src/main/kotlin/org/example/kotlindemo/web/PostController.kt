package org.example.kotlindemo.web

import org.example.kotlindemo.domain.Post
import org.example.kotlindemo.service.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.HttpURLConnection

@RestController
@RequestMapping("/posts")
class PostController(private val postService: PostService) {

    @GetMapping
    fun findPostsAndCategories(): ResponseEntity<Map<String, Any>> {
        val postsAndCategories = postService.findPostsAndCategories()

        val response = mapOf(
            "code" to HttpURLConnection.HTTP_OK,
            "message" to "Success",
            "data" to mapOf("post" to postsAndCategories)
        )

        return ResponseEntity.ok(response)
    }

//    @PostMapping
//    fun findPosts2(): ResponseEntity<Map<String, Any>>{
//        val response = mapOf(
//            "code" to "code",
//            "message" to "Success",
//            "data" to "data"
//        )
//        return ResponseEntity.ok(response)
//    }

    @PostMapping("/insert-info")
    fun insertPostInfo(post: Post) {


    }


}