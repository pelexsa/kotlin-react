package org.example.kotlindemo.domain

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class BaseEntity : Serializable {

    @CreatedBy
    val createdUser: String = ""

    @CreatedDate
    val createdDate: LocalDateTime = LocalDateTime.now()

    @LastModifiedBy
    val modifiedUser: String? = null

    @LastModifiedDate
    val modifiedDate: LocalDateTime = LocalDateTime.now()
}
