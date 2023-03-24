package com.opendebugger62.pengenalanwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hitung = findViewById<Button>(R.id.btn_hitung)
        hitung.setOnClickListener {
            hitung()
        }
    }

    private fun hitung() {
        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val hasil = findViewById<TextView>(R.id.tv_hasil)
        val tambah = Integer.parseInt(angka1.text.toString()) + Integer.parseInt(angka2.text.toString())
        hasil.text = tambah.toString()
    }
}
