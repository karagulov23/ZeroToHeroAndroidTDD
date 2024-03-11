package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var rootlayout: LinearLayout
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rootlayout = findViewById(R.id.rootLayout)
        val btnRemove = findViewById<Button>(R.id.removeButton)
        textView = findViewById(R.id.titleTextView)

        btnRemove.setOnClickListener {
            rootlayout.removeView(textView)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val removedTextView = savedInstanceState.getBoolean(KEY)
        if (removedTextView) {
            rootlayout.removeView(textView)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val removedTextView = rootlayout.childCount == 1
        outState.putBoolean(KEY, removedTextView)
    }

    companion object {
        private const val KEY = "key"
    }
}