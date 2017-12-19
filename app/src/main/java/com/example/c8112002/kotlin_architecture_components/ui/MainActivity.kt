package com.example.c8112002.kotlin_architecture_components.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.c8112002.kotlin_architecture_components.R
import com.example.c8112002.kotlin_architecture_components.data.eintity.User
import com.example.c8112002.kotlin_architecture_components.ext.observe

class MainActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProviders
                .of(this)
                .get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.user.observe(this) {
            Log.d("MainActivity", it?.name)
        }

        viewModel.name.observe(this) {
            Log.d("MainActivity", it)
        }
    }
}
