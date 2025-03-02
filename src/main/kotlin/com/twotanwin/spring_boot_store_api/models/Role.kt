package com.twotanwin.spring_boot_store_api.models

import jakarta.persistence.*

enum class RoleName{
    USER, MANAGER, ADMIN
}

@Entity
@Table(name="roles")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    var roleName: RoleName,

    @ManyToMany(mappedBy = "roles")
    val user: MutableList<User> = mutableListOf()

)

