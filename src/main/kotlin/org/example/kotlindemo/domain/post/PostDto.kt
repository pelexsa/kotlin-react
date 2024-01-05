package org.example.kotlindemo.domain.post

import java.time.LocalDateTime

data class PostDto(
    val name: String,
    val description: String?,
    val tag: String?,
    val title: String?,
    val content: String?,
    val createdUser: String?,
    val createdDate: LocalDateTime?
)
