package com.sideprojhub.hub.android.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.sideprojhub.hub.android.BaseActivity
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding.lifecycleOwner = this@MainActivity
    }
}