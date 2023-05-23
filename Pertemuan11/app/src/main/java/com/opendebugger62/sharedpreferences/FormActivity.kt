package com.opendebugger62.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    lateinit var profilePref: ProfilePref
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val btnSave = findViewById<View>(R.id.btnSave)
        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etGender = findViewById<EditText>(R.id.etGender)
        profilePref = ProfilePref(this)
        if (profilePref.preference.contains(ProfilePref.Name)) {
            val profile : Profile = profilePref.getProfile()
            etName.setText(profile.name)
            profile.age?.let { etAge.setText(it.toString()) }
            etGender.setText(profile.gender)
        }
        btnSave.setOnClickListener {
            val name : String = etName.text.toString().trim()
            val age : String = etAge.text.toString().trim()
            val gender : String = etGender.text.toString().trim()
            val profile = Profile(name, age.toInt(), gender)
            saveToPref(profile)
        }
    }

    private fun saveToPref(profile: Profile) {
        profilePref.setProfile(profile)
        Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show()
        Intent(this, MainActivity::class.java).also {
            it.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(it)
        }

    }
}