package com.example.converterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class meterToKm : AppCompatActivity() {
    private lateinit var txtMeter:EditText
    private lateinit var txtKm:EditText
    private lateinit var btnConvertKm:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meter_to_km)

        txtMeter = findViewById(R.id.txtMeter)
        txtKm = findViewById(R.id.txtKm)
        btnConvertKm = findViewById(R.id.btnConvertKm)

        btnConvertKm.setOnClickListener(View.OnClickListener{
            var metersInput:Double = txtMeter.text.toString().toDouble()
            var kilometers = metersInput / 1000
            txtKm.setText(kilometers.toString() + " km")
        })
    }
}