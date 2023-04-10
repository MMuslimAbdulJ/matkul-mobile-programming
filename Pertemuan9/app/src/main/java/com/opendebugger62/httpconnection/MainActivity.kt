package com.opendebugger62.httpconnection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.TextView
import com.android.volley.ParseError
import com.android.volley.Request
import com.android.volley.Request.Method
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.opendebugger62.httpconnection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = binding.hasil
        val button = binding.koneksi
        button.setOnClickListener {
            hubungiServer(hasil)
        }

    }

    private fun hubungiServer(hasil : TextView) {
        val queue = Volley.newRequestQueue(this)
        val url = Global.getUrl()
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                hasil.text = "Hasilnya adalah konek"
            },
            Response.ErrorListener { hasil.text = "Tidak konek" })
        queue.add(stringRequest)
    }
}