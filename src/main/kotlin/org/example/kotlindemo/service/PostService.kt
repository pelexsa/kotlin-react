package org.example.kotlindemo.service

import org.example.kotlindemo.domain.post.Post
import org.example.kotlindemo.domain.post.PostCategory
import org.example.kotlindemo.domain.post.PostDto
import org.example.kotlindemo.repository.PostCategoryRepository
import org.example.kotlindemo.repository.PostRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
    private val postCategoryRepository: PostCategoryRepository,
    private val publisher: ApplicationEventPublisher
) {

    fun listAllPosts(): List<Post> = postRepository.findAll()

    fun findPostsAndCategories(): List<PostDto> = postRepository.findPostsAndCategories()

    fun insertCategory(postCategory: PostCategory){
        postCategoryRepository.save(postCategory)
    }

    fun updateCategory(postCategory: PostCategory){
        postCategoryRepository.save(postCategory)
    }

    fun deleteCategory(categoryId: Long){
        postCategoryRepository.deleteById(categoryId)
    }

}