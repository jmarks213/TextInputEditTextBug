package com.jason.marks.textinputedittextbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.activity_main_launch_dialog_fragment_btn)

        btn.setOnClickListener {
            MyDialogFragment().show(supportFragmentManager, "my_dialog_fragment")
        }
    }
}