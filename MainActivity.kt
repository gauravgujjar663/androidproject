package com.example.ca1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var submitButton = findViewById<Button>(R.id.submitBtn)
        submitButton.setOnClickListener {
            var s1 = findViewById<EditText>(R.id.sb1)
            var s2 = findViewById<EditText>(R.id.sb2)
            var s3 = findViewById<EditText>(R.id.sb3)
            var m1 = s1.text.toString().toFloat()
            var m2 = s2.text.toString().toFloat()
            var m3 = s3.text.toString().toFloat()
            var gpa = (m1+m2+m3)/30.0
            var display = findViewById<TextView>(R.id.display)
            display.text = "Your Current GPA is: " + gpa.toString()
        }
    }
}