package com.opendebugger62.utsmuslim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.opendebugger62.utsmuslim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var pemrogramanArrayList : ArrayList<Pemrograman>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageId = intArrayOf(
            R.drawable.logo_kotlin,
            R.drawable.logo_php,
            R.drawable.logo_js,
            R.drawable.logo_cpp,
            R.drawable.logo_golang,
            R.drawable.logo_python,
            R.drawable.logo_rust
        )
        val nama = arrayOf(
            "Kotlin",
            "PHP",
            "JavaScript",
            "C++",
            "GoLang",
            "Python",
            "Rust"
        )
        val deskripsi = arrayOf(
            "Dikembangkan oleh JetBrains",
            "Dikembangkan oleh The PHP Development Team, Zend Technologies",
            "Dikembangkan oleh Brendan Eich of Netscape initially; others have also contributed to the ECMAScript standard",
            "Dikembangkan oleh Bjarne Stroustrup",
            "Dikembangkan oleh Google",
            "Dikembangkan oleh Guido van Rossum",
            "Dikembangkan oleh Graydon Hoare"
        )

        pemrogramanArrayList = ArrayList()

        for (i in nama.indices) {
            val pemrograman = Pemrograman(nama[i], deskripsi[i], imageId[i])
            pemrogramanArrayList.add(pemrograman)
        }


        binding.listView.adapter = MyAdapter(this, pemrogramanArrayList)

    }
}