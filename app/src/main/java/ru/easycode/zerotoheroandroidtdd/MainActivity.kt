package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChange = findViewById<Button>(R.id.changeButton)
        val tvHello = findViewById<TextView>(R.id.titleTextView)

        btnChange.setOnClickListener {
            tvHello.text = "I am an Android Developer!"
        }


    }
}