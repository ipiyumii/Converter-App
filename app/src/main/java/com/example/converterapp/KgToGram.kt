package com.example.converterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KgToGram : AppCompatActivity() {
    private lateinit var txtKg:EditText
    private lateinit var txtGram:EditText
    private lateinit var btnConvert:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kg_to_gram)

        txtKg = findViewById(R.id.txtKg)
        txtGram = findViewById(R.id.txtGram)
        btnConvert = findViewById(R.id.btnConvert)


        btnConvert.setOnClickListener(View.OnClickListener{
            var gram:Double = txtGram.text.toString().toDouble()
            var kilograms = gram / 1000
            txtKg.setText(kilograms.toString() + " kg")
        })
    }
}