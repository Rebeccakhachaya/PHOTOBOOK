package com.example.photos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvOcean=findViewById<TextView>(R.id.tvocean)
        var btnbutton1=findViewById<Button>(R.id.btnbutton1)
        btnbutton1.setOnClickListener{
            var intent=Intent(baseContext,shirine::class.java)
            startActivity(intent)
        }
        btnbutton1.setOnClickListener{
            var intent=Intent(baseContext,shirine::class.java)
            startActivity(intent)
        }
    }
}