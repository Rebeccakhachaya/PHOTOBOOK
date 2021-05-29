package com.example.photos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class shirine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shirine)
        var tvshirine=findViewById<TextView>(R.id.tvshirine)
        var btnbutton2=findViewById<Button>(R.id.btnbutton2)
        var btnprev=findViewById<Button>(R.id.btnprev)


        btnbutton2.setOnClickListener{
            var intent= Intent(baseContext,stone::class.java)
            startActivity(intent)
        }
        btnprev.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

