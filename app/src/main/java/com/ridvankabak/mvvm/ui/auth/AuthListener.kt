package com.ridvankabak.mvvm.ui.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(mesaj : String)
}