package com.example.meeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.meeting.fragments.DashboardFragment
import com.example.meeting.fragments.ProfileFragment
import com.example.meeting.fragments.ShoppingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // load first fragment by default
        loadFragment(DashboardFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener {menuItem ->
            when{
                menuItem.itemId ==R.id.navigationdashboard ->{
                    loadFragment(DashboardFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigationshopping ->{
                    loadFragment(ShoppingFragment())
                    return@setOnNavigationItemSelectedListener  true
                }
                menuItem.itemId == R.id.navigationprofile ->{
                    loadFragment(ProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else ->{
                    return@setOnNavigationItemSelectedListener false
                }
            }

        }
    }
    private fun loadFragment( fragment : Fragment ){
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
          fragmentTransaction.replace(R.id.fragmentContainer,fragment)
            fragmentTransaction.commit()
        }
    }
}
