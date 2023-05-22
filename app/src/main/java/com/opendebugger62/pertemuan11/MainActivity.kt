package com.opendebugger62.pertemuan11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var profilePref : ProfilePref
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvGender = findViewById<TextView>(R.id.tvGender)
        profilePref = ProfilePref(this)
        if (profilePref.preference.contains(ProfilePref.Name)) {
            val profile : Profile = profilePref.getProfile()
            tvName.text = profile.name
            tvAge.text = profile.age.toString()
            tvGender.text = profile.gender
        }
        val btnEdit = findViewById<View>(R.id.btnEdit)
        btnEdit.setOnClickListener {
            Intent(this, FormActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}