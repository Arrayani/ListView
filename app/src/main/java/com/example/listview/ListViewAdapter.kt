package com.example.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

//class ListViewAdapter: BaseAdapter() { ini yang ori nya yg pertama kali dibuat,
//setelah itu di modifikasi sesuai kebutuhan.
class ListViewAdapter(val nama:Array<String>,val noTelp:Array<String>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

//        var convertView = convertView
        var convertView: View?
        convertView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_listview,parent,false)
        val namaTv = convertView.findViewById<TextView>(R.id.nama)
        namaTv.text = nama.get(position)
        val noTelpTv = convertView.findViewById<TextView>(R.id.nomor_telepon)
        noTelpTv.text = noTelp.get(position)


        return convertView
    }

    //override fun getCount(): Int = nama.size /// bisa juga lebih prakti seperti ini
    override fun getCount(): Int {
     return nama.size
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }


}