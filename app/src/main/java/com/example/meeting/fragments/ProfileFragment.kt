package com.example.meeting.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.meeting.activities.EditProfileActivity
import com.example.meeting.activities.PasswordActivity
import com.example.meeting.R
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        editprofile.setOnClickListener {
            startActivity(Intent(activity, EditProfileActivity::class.java))
        }

        Password.setOnClickListener {
            startActivity(Intent(activity, PasswordActivity::class.java))
        }
    }

}
