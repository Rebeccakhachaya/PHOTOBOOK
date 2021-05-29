package com.example.photos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class kenya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kenya)
        var tvKenya=findViewById<TextView>(R.id.tvkenya)
        var btnkenya=findViewById<Button>(R.id.btnkenya)
        var btnprev3=findViewById<Button>(R.id.btnprev3)
        btnkenya.setOnClickListener{
            var intent= Intent(baseContext,bird::class.java)
            startActivity(intent)
        }
        btnprev3.setOnClickListener{
            var intent= Intent(baseContext,stone::class.java)
            startActivity(intent)
        }



    }
}