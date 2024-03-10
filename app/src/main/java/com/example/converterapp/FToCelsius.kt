package com.example.converterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FToCelsius : AppCompatActivity() {
    private lateinit var txtFah:EditText
    private lateinit var txtCelsius:EditText
    private lateinit var btnConvertCelsius:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fto_celsius)

        txtFah  = findViewById(R.id.txtFah)
        txtCelsius = findViewById(R.id.txtCelsius)
        btnConvertCelsius = findViewById(R.id.btnConvertCelsius)

        btnConvertCelsius.setOnClickListener(View.OnClickListener{
            var fahrenheitInput:Double = txtFah.text.toString().toDouble()
            val celsiusResult: Double = (fahrenheitInput - 32) * 5 / 9
            txtCelsius.setText(celsiusResult.toString() + " C")
        })
    }
}