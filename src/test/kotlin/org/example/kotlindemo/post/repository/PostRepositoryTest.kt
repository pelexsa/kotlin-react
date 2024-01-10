package org.example.kotlindemo.service

import jakarta.transaction.Transactional
import org.example.kotlindemo.repository.PostCategoryRepository
import org.example.kotlindemo.repository.PostRepository
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class PostRepositoryTest @Autowired constructor(
    private val postRepository: PostRepository,
    private val postCategoryRepository: PostCategoryRepository
) {

    @Test
    @Transactional
    @DisplayName("목록 조회")
    fun listAllPosts() {
        val postCategories = postCategoryRepository.findAll();
        for (idx in postCategories.indices){
            println("$idx postCategory is ${postCategories[idx]}")
        }


    }

}