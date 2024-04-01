package com.sideprojhub.hub.android.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.sideprojhub.hub.android.BaseActivity
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {

    private val binding by binding<ActivityLoginBinding>(R.layout.activity_login)
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding.lifecycleOwner = this@LoginActivity
    }


}