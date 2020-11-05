package com.himanshoe.core.model

data class User(
    val id: String = "",
    val displayUrl: String = "",
    val name: String = "",
    val email: String = "",
    val description: String = ""
) {
    fun isLoggedIn(): Boolean {
        return id.isNotEmpty()
    }
}