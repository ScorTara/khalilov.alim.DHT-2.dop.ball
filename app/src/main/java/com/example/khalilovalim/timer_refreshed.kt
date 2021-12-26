package com.example.khalilovalim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class timer_refreshed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_refreshed)

        val textView = findViewById<ImageView>(R.id.starsecond)

        textView.setOnClickListener{
            startActivity(Intent(this,rank_zero_day::class.java))

    }
}}