package com.example.converterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var imgKg: ImageView
    private lateinit var imgCelsius: ImageView
    private lateinit var imgKm: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgKg = findViewById(R.id.imgKg)
        imgCelsius = findViewById(R.id.imgCelsius)
        imgKm = findViewById(R.id.imgKm)

        imgKg.setOnClickListener {
            try {
                val intent = Intent(applicationContext, KgToGram::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error launching KgToGram activity: ${e.message}")
            }
        }

        imgCelsius.setOnClickListener {
            try{
                val intent = Intent(applicationContext, FToCelsius::class.java)
                startActivity(intent)
            } catch (e: Exception){
                Log.e("MainActivity", "Error launching activity: ${e.message}")
            }
        }

        imgKm.setOnClickListener {
            try{
                val intent = Intent(applicationContext, meterToKm::class.java)
                startActivity(intent)
            }catch (e: Exception){
                Log.e("MainActivity", "Error launching activity: ${e.message}")
            }

        }

    }
}