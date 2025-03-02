package com.twotanwin.spring_boot_store_api.models

data class ResponseModel(
    val status: String,
    val message: String,
    val data: Any? = null
)
