package com.example.advnative160418066

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
val nama:String="Nicky"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Wellcome to Android $nama", Toast.LENGTH_SHORT).show()
    }
}