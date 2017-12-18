package com.example.c8112002.kotlin_architecture_components.data.repository

import com.example.c8112002.kotlin_architecture_components.data.eintity.User


interface UserRepositoryInterface {
    fun getUser(): User
}


class UserRepository: UserRepositoryInterface {
    override fun getUser(): User {
        return User("sato", 28)
    }
}

