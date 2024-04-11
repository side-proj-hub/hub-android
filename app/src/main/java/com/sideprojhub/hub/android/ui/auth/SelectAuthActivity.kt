package com.sideprojhub.hub.android.ui.auth

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ActivitySelectAuthBinding
import com.sideprojhub.hub.android.ui.BaseActivity

class SelectAuthActivity : BaseActivity<ActivitySelectAuthBinding>(R.layout.activity_select_auth) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnManager.root.setOnClickListener {
            toast("관리자 클릭됨.")
        }

        binding.btnEmployee.root.setOnClickListener {
            toast("직원 클릭됨.")
        }
    }

}