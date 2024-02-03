package com.example.itcompottest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    var count = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val textViewCount = findViewById<TextView>(R.id.textView_count)
        val button = findViewById<Button>(R.id.button)
        
        button.setOnClickListener {
            count += 1
            textViewCount.text = count.toString()
            if (count >= 10) {
                textViewCount.text = "Красавчик! Ты закликал меня досмерти ;D"
                button.isEnabled = true
            }
        }
    }
}