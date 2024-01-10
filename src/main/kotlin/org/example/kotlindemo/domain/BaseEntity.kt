package org.example.kotlindemo.domain

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.io.Serializable
import java.time.LocalDateTime

@MappedSuperclass
class BaseEntity : Serializable
