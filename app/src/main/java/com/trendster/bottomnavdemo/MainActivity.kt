package com.trendster.bottomnavdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var bottomBar : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Bottom nav view*/
        bottomBar = findViewById(R.id.bottomNavigationView)
        navController = findNavController(R.id.fragment)
        bottomBar.setupWithNavController(navController)

        /** App Bar changes as Fragment changes */
        appBarConfiguration = AppBarConfiguration(setOf(R.id.oneFragment, R.id.twoFragment, R.id.threeFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

    }
}