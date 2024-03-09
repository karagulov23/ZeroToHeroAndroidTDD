package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHide = findViewById<Button>(R.id.hideButton)
        textView = findViewById(R.id.titleTextView)

        btnHide.setOnClickListener {
            textView.visibility = View.INVISIBLE
        }

    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textView.visibility = savedInstanceState.getInt(KEY)
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY, textView.visibility)
    }

    companion object {
        private const val KEY = "visibility"
    }

}