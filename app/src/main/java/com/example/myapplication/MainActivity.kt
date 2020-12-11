package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =  findViewById<Button>(R.id.button1)
        val button2 =  findViewById<Button>(R.id.button2)
        val button3 =  findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            Log.e("button1","Pressed!")
        }
        button2.setOnClickListener {
            Log.e("button2","Pressed!")
        }
        button3.setOnClickListener {
            Log.e("button3","Pressed!")
        }
    }
}
