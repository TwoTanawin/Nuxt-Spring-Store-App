package com.twotanwin.spring_boot_store_api.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun hello(): String{
        return "Hello Kotlin";
    }
}