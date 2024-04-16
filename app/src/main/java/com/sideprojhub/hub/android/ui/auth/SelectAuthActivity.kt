package com.sideprojhub.hub.android.ui.auth

import android.content.Intent
import android.os.Bundle
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ActivitySelectAuthBinding
import com.sideprojhub.hub.android.ui.BaseActivity
import com.sideprojhub.hub.android.ui.manage.create.CreateCompanyActivity

class SelectAuthActivity : BaseActivity<ActivitySelectAuthBinding>(R.layout.activity_select_auth) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)

    }

    override fun setListener() {
        super.setListener()

            binding.btnManager.root.setOnClickListener {
                startActivity(Intent(this@SelectAuthActivity, CreateCompanyActivity::class.java))
            }

            binding.btnEmployee.root.setOnClickListener {
                toast("직원 클릭됨.")
            }
    }

}