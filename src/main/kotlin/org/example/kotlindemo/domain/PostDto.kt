package org.example.kotlindemo.domain

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.Comment

@Entity
@Table(name = "POST")
data class PostDto(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val postId: Long = 0,

        @Column(nullable = false)
        var pinId: Int = 0,

        @Lob
        @Comment("내용") @Column(nullable = false)
        var content: String,

        @ColumnDefault("'N'")
        @Comment("삭제 여부") @Column(length = 1, nullable = false)
        var delYn: String,

        @Comment("순서") @Column(nullable = false)
        var sort: Int = 0,

        @Column(length = 45)
        @Comment("등록자")
        var createdUser: String,

        @Column(length = 45)
        @Comment("수정자")
        var modifiedUser: String,

)
