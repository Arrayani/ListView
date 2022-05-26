package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private val nama = arrayOf("Roni","Rani","Valtio","Keyza","Thor","Loki","Flash")
    private val noTelp = arrayOf("08111901081","08129600266","02185901642","0218580445","081345454554","911","112")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val listview = findViewById<ListView>(R.id.listview)
        listview.adapter = ListViewAdapter(nama,noTelp)
     //   listview

        listview.isClickable = true
        listview.setOnItemClickListener { adapterView, view, position, id ->

            val name = nama[position]
            val telp = noTelp[position]

            Toast.makeText(this,name + telp,Toast.LENGTH_SHORT).show()

        }
    }


}