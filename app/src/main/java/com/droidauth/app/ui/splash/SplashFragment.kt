package com.droidauth.app.ui.splash

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.navigation.fragment.findNavController
import com.droidauth.app.R
import com.droidauth.app.data.NavState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : Fragment(R.layout.fragment_splash) {

    private val viewModel: SplashViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe()
    }

    private fun observe() {
        viewModel.destination.asLiveData().observe(viewLifecycleOwner, Observer {
            navigate(it)
        })
    }

    private fun navigate(navState: NavState) {
        when (navState) {
            NavState.Login -> findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
            else -> Unit
        }
    }

}