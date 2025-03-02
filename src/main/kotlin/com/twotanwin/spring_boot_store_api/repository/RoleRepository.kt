package com.twotanwin.spring_boot_store_api.repository

import com.twotanwin.spring_boot_store_api.models.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository:JpaRepository<Role, Long> {
    fun findByRoleName(roleName: String): Role?
}