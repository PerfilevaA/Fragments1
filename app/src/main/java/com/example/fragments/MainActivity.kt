package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private FrameLayout frameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mouse = androidx.compose.foundation.layout.Box {
            findViewById<>(R.id.mouse)
        }
        var cat = androidx.compose.foundation.layout.Box {
            var findViewById = findViewById<>(R.id.cat)
            findViewById



    }
}