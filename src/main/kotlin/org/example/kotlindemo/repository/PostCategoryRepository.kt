package org.example.kotlindemo.repository

import org.example.kotlindemo.domain.post.PostCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostCategoryRepository : JpaRepository<PostCategory, Long> {

}