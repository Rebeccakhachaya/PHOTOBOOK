package com.example.photos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class bird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird)
        var tvbird=findViewById<TextView>(R.id.tvbird)
        var btnbird=findViewById<Button>(R.id.btnbird)
        var btnprev4=findViewById<Button>(R.id.btnprev4)
        btnprev4.setOnClickListener{
            var intent= Intent(baseContext,bird::class.java)
            startActivity(intent)
        }
        btnprev4.setOnClickListener{
            var intent= Intent(baseContext,kenya::class.java)
            startActivity(intent)
        }
    }
}