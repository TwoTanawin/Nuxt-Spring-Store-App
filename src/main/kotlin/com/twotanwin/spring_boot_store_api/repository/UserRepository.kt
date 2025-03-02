package com.twotanwin.spring_boot_store_api.repository

import com.twotanwin.spring_boot_store_api.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<User, Long> {
    fun findByUsername(username: String): User?
    fun findByEmail(email: String): User?
}