package org.example.kotlindemo.repository

import org.example.kotlindemo.domain.PostDto
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<PostDto, Long>