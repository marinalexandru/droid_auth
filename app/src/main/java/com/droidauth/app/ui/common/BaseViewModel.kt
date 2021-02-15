package com.droidauth.app.ui.common

import androidx.lifecycle.ViewModel
import com.droidauth.app.data.NavState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Suppress("PropertyName")
open class BaseViewModel : ViewModel() {

    val destination: StateFlow<NavState> get() = _destination
    protected val _destination = MutableStateFlow<NavState>(NavState.Empty)

}