package org.example.kotlindemo.repository

import org.example.kotlindemo.domain.post.Post
import org.example.kotlindemo.domain.post.PostDto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post, Long> {
    @Query("SELECT new org.example.kotlindemo.domain.post.PostDto(pc.name, pc.description, p.tag, p.title, p.content, p.createdUser, " +
            "COALESCE(p.modifiedDate, p.createdDate)) " +
            "FROM PostCategory pc " +
            "LEFT JOIN pc.posts p " +
            "WHERE pc.delYn = 'N' AND p.delYn = 'N' " +
            "ORDER BY pc.sort, p.sort")
    fun findPostsAndCategories(): List<PostDto>
}