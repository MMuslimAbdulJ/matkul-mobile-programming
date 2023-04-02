package com.opendebugger62.utsmuslim

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity, private val arrayList : ArrayList<Pemrograman>) : ArrayAdapter<Pemrograman>(context, R.layout.daftar_list, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.daftar_list, null)

        val imageView : ImageView = view.findViewById(R.id.image_view)
        val nama : TextView = view.findViewById(R.id.tv_nama)
        val deskripsi : TextView = view.findViewById(R.id.tv_deskripsi)

        imageView.setImageResource(arrayList[position].imageId)
        nama.text = arrayList[position].nama
        deskripsi.text = arrayList[position].deskripsi

        return view
    }
}