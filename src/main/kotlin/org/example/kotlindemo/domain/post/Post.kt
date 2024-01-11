package org.example.kotlindemo.domain.post

import jakarta.persistence.*
import org.example.kotlindemo.domain.BaseEntity
import org.hibernate.annotations.ColumnDefault

@Entity
@Table(name = "POST")
class Post (
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
        var sort: Int

): BaseEntity ()
