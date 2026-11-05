package com.example.adaptivelayout

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.slidingpanelayout.widget.SlidingPaneLayout
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.slidingpane)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    val pane = findViewById<SlidingPaneLayout>(R.id.slidingpane)
    val title = findViewById<TextView>(R.id.detailTitle)
    val description = findViewById<TextView>(R.id.detailDescription)


    fun showDetails(heading: String, details: String) {
        title.text = heading
        description.text = details
        pane.openPane()
    }

    findViewById<Button>(R.id.buttonAndroid).setOnClickListener {
        showDetails("Android", "Android adapts to different screen sizes.")
    }

    findViewById<Button>(R.id.buttonKotlin).setOnClickListener {
        showDetails("Kotlin", "Kotlin is used to build Android apps.")
    }

    findViewById<Button>(R.id.buttonBack).setOnClickListener {
        pane.closePane()
    }





}