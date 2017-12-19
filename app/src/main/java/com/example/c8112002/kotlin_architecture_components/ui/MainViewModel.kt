package com.example.c8112002.kotlin_architecture_components.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.example.c8112002.kotlin_architecture_components.data.eintity.User
import com.example.c8112002.kotlin_architecture_components.data.repository.UserRepository
import com.example.c8112002.kotlin_architecture_components.data.repository.UserRepositoryInterface

class MainViewModel(): ViewModel() {
    val user = MutableLiveData<User>()
    val name: LiveData<String>
    val userRepository: UserRepositoryInterface = UserRepository()

    init {
        user.value = userRepository.getUser()
        name = Transformations.map(user) { user ->
            user.name
        }
        Log.d("MainViewModel", "init")
    }
}

