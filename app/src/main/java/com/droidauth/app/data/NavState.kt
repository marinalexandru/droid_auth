package com.droidauth.app.data

sealed class NavState {
    object Empty : NavState()
    object Login : NavState()
}