package org.example.kotlindemo.domain.post

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.time.LocalDateTime

@Entity
@Table(name = "POST")
class Post(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val postId: Long = 0L,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "CATEGORY_ID", nullable = false)
        var category: PostCategory,

        @Column(name = "TAG", nullable = false, length = 30)
        var tag: String,

        @Column(name = "TITLE", nullable = false, length = 30)
        var title: String,

        @Lob
        @Column(name = "CONTENT", nullable = false)
        var content: String,

        @ColumnDefault("'N'")
        @Column(name = "DEL_YN", nullable = false, length = 1)
        var delYn: String = "N",

        @Column(name = "SORT", nullable = false)
        var sort: Int,

        @Column(name = "CREATED_USER", nullable = false, length = 45)
        var createdUser: String,

        @Column(name = "CREATED_DATE", nullable = false)
        var createdDate: LocalDateTime = LocalDateTime.now(),

        @Column(name = "MODIFIED_USER", length = 45)
        var modifiedUser: String? = null,

        @Column(name = "MODIFIED_DATE")
        var modifiedDate: LocalDateTime? = null

)
