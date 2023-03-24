package com.opendebugger62.multipleactivitymuslim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSecond = findViewById<View>(R.id.btn_second)
        btnSecond.setOnClickListener {
            Toast.makeText(this, "Second Activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("nama", "Muhammad Muslim Abdul Jabbaar")
            intent.putExtra("email", "mmuslimabdulj@gmail.com")
            startActivity(intent)
        }

        val btnThird = findViewById<View>(R.id.btn_third)
        btnThird.setOnClickListener {
            Toast.makeText(this, "Third Activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}