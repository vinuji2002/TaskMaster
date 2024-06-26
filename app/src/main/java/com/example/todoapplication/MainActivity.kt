package com.example.todoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            val intent= Intent(this,CreateCard::class.java)
            startActivity(intent)
        }
        deleteAll.setOnClickListener{
            DataObject.deleteAll()

        }

        recycler_view.adapter=Adapter(DataObject.getAllData())
        recycler_view.LayoutManager= LinearLayoutManager(this)
    }
}