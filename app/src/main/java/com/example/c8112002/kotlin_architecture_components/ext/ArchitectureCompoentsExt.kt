package com.example.c8112002.kotlin_architecture_components.ext

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer

fun <T> LiveData<T>.observe(owner: LifecycleOwner, observer: (T?) -> Unit) = observe(owner, object : Observer<T> {
    override fun onChanged(v: T?) {
        observer.invoke(v)
    }
})
