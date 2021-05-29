package com.example.photos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class stone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stone)
        var tvStone = findViewById<TextView>(R.id.tvstone)
        var btnstone = findViewById<Button>(R.id.btnstone)
        var btnprev1 = findViewById<Button>(R.id.btnprev1)
        btnstone.setOnClickListener {
            var intent = Intent(baseContext, kenya::class.java)
            startActivity(intent)
        }
        btnprev1.setOnClickListener {
            var intent = Intent(baseContext, shirine::class.java)
            startActivity(intent)
        }
    }
}


