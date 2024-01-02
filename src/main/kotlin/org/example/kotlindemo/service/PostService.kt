package org.example.kotlindemo.service

import org.example.kotlindemo.domain.PostDto
import org.example.kotlindemo.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {

    fun listAllPosts(): List<PostDto> = postRepository.findAll()

}