package org.example.kotlindemo.domain.post

import jakarta.persistence.*
import org.example.kotlindemo.domain.BaseEntity
import org.hibernate.annotations.ColumnDefault

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

    @OneToMany(mappedBy = "category")
    var posts: MutableList<Post> = mutableListOf()

) : BaseEntity() {
    override fun toString(): String {
        return "PostCategory(categoryId=$categoryId, name=$name, description=$description, sort=$sort)"
    }
}
