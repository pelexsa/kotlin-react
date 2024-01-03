package org.example.kotlindemo.service

import org.example.kotlindemo.domain.Post
import org.example.kotlindemo.domain.PostDto
import org.example.kotlindemo.repository.PostRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {

    fun listAllPosts(): List<Post> = postRepository.findAll()

    fun findPostsAndCategories(): List<PostDto> = postRepository.findPostsAndCategories()

}