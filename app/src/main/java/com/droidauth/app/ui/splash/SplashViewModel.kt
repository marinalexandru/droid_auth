package com.droidauth.app.ui.splash

import androidx.lifecycle.viewModelScope
import com.droidauth.app.data.NavState
import com.droidauth.app.data.SPLASH_DELAY
import com.droidauth.app.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel() {

    init {
        viewModelScope.launch {
            delay(SPLASH_DELAY)
            _destination.emit(NavState.Login)
        }
    }

}