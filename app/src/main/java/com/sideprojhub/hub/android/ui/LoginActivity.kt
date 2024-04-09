package com.sideprojhub.hub.android.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ActivityLoginBinding
import com.sideprojhub.hub.android.ui.signup.SignupActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding.lifecycleOwner = this@LoginActivity
    }

    override fun setListener() {
        super.setListener()

        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this@LoginActivity, SignupActivity::class.java))
        }
    }

}