package org.example.kotlindemo.domain.post

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.time.LocalDateTime

@Entity
@Table(name = "POST_CATEGORY")
class PostCategory(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val categoryId: Long? = 0L,

        @Column(name = "NAME", nullable = false, length = 30)
        var name: String,

        @Column(name = "DESCRIPTION", length = 100)
        var description: String? = null,

        @ColumnDefault("'N'")
        @Column(name = "DEL_YN", nullable = false, length = 1)
        var delYn: String = "N",

        @Column(name = "SORT", nullable = false)
        var sort: Int = 0,

        @Column(name = "CREATED_USER", nullable = false, length = 45)
        var createdUser: String,

        @Column(name = "CREATED_DATE", nullable = false)
        var createdDate: LocalDateTime = LocalDateTime.now(),

        @Column(name = "MODIFIED_USER", length = 45)
        var modifiedUser: String? = null,

        @Column(name = "MODIFIED_DATE")
        var modifiedDate: LocalDateTime? = null,

        @OneToMany(mappedBy = "category")
        var posts: MutableList<Post> = mutableListOf()

)
