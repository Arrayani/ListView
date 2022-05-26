package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val values = arrayOf("Item One", "Item Two", "Item Three", "Item Four", "Item Five")

        val mListView = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)

        mListView.adapter =adapter

        mListView.setOnItemClickListener{parent, view, position, id ->

            //Toast.makeText(this@MainActivity, "You have Clicked " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show()

            if (position==0){
                Toast.makeText(this@MainActivity, "Item One",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "Item Two",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Item Three", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Item Four",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Item Five",  Toast.LENGTH_SHORT).show()
            }
        }

        val  secondBtn = findViewById<Button>(R.id.secondBtn)
        secondBtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        val thirdBtn = findViewById<Button>(R.id.thirdBtn)
        thirdBtn.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

        val foutrhdBtn = findViewById<Button>(R.id.fourthBtn)
        foutrhdBtn.setOnClickListener {
            val intent = Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }

    }



}