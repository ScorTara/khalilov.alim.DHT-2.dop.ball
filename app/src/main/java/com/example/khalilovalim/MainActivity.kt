package com.example.khalilovalim

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<ImageView>(R.id.star)

        textView.setOnClickListener{
            startActivity(Intent(this,Ranks_third_day::class.java))


                val threedays = findViewById<TextView>(R.id.textView)
                val button = findViewById<ImageView>(R.id.refresh)
                button.setOnClickListener(View.OnClickListener {
                    threedays.setText("0 Day")
                })
        }

            val zeroday = findViewById<TextView>(R.id.textView2)
            val refresher = findViewById<ImageView>(R.id.refresh)
        refresher.setOnClickListener(View.OnClickListener {
                zeroday.setText("00:00:00")
            })
        val quotechange = findViewById<TextView>(R.id.textView3)
        val refreshed = findViewById<ImageView>(R.id.refresh)
        refreshed.setOnClickListener(View.OnClickListener {
            quotechange.setText("“Manners are face of man!”")
        })
            val quotechanger = findViewById<TextView>(R.id.textView4)
            val refresh2= findViewById<ImageView>(R.id.refresh)
            refresh2.setOnClickListener(View.OnClickListener {
                quotechange.setText("- Galahad")

            })
        }
    }