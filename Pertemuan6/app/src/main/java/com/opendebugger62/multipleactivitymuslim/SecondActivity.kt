package com.opendebugger62.multipleactivitymuslim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent

        val namaText = findViewById<TextView>(R.id.nama)
        val emailText = findViewById<TextView>(R.id.email)

        namaText.text = intent.getStringExtra("nama")
        emailText.text = intent.getStringExtra("email")

    }
}