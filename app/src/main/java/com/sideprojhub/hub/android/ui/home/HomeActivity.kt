package com.sideprojhub.hub.android.ui.home

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationBarView
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ActivityHomeBinding
import com.sideprojhub.hub.android.ui.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.layout_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // menu 의 id와 nav_graph 의 id 가 같을 경우, setupWithController 로 destination 을 매칭 시킬 수 있음.
        binding.nav.setupWithNavController(navController)

        NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.feedFragment -> {
                    true
                }

                R.id.clubFragment -> {

                    true
                }

                R.id.myClubFragment -> {

                    true
                }

                R.id.myInfoFragment -> {

                    true
                }

                else -> false
            }
        }

    }

}