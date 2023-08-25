package com.manjil.playstorekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.manjil.playstorekotlin.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private val homeFragment = HomeFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tlContainer: TabLayout = findViewById(R.id.tlContainer)

        tlContainer.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val position: Int = tab!!.position
                when(position){
                    0 -> supportFragmentManager.beginTransaction().replace(R.id.flContainer, homeFragment).commit()
                    1 -> supportFragmentManager.beginTransaction().replace(R.id.flContainer, homeFragment).commit()
                    2 -> supportFragmentManager.beginTransaction().replace(R.id.flContainer, homeFragment).commit()
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        tlContainer.addTab(tlContainer.newTab().setText("Home"),true)
        tlContainer.addTab(tlContainer.newTab().setText("Top Charts"))
        tlContainer.addTab(tlContainer.newTab().setText("Children"))
    }
}