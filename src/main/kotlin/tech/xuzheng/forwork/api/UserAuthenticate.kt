package tech.xuzheng.forwork.api

interface UserAuthenticate : API {
    fun authenticate(username: String, password: String): Boolean
}