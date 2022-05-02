package com.zenza.store.domain

import java.sql.Timestamp
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    var id: Long? = null
    @Column(nullable = false, length = 350)
    var firstName: String? = null
    @Column(nullable = false, length = 350)
    var lastName: String? = null
    @Column(nullable = false, unique = true)
    var email: String? = null
    @Column(nullable = false, unique = true, length = 350)
    var username: String? = null
    @Column(nullable = false, unique = true, length = 12)
    var phoneNumber: String? = null
    @Column(nullable = false)
    var password: String? = null
    @Column(nullable = false)
    var status = 0
    @Column(name = "created_at", nullable = false)
    var createdAt: Timestamp? = null
    @Column(name = "created_by", nullable = false, length = 255)
    var createdBy: String? = "admin"
    @Column(name = "modified_at", nullable = false)
    var modifiedAt: Timestamp? = Timestamp.from(Instant.now())
    @Column(name = "modified_by", nullable = false, length = 255)
    var modifiedBy: String = "admin"
    @Column(name = "deleted_by", length = 255)
    var deletedBy: String? = null
    @Column(name = "deleted_at")
    var deletedAt: Timestamp? = null
}