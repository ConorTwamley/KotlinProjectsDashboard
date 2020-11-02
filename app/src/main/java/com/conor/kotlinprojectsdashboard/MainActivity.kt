package com.conor.kotlinprojectsdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherTile = findViewById<CardView>(R.id.weather_tile)
        val locationTile = findViewById<CardView>(R.id.location_tile)
        val calculatorTile = findViewById<CardView>(R.id.calculator_tile)
        val medicalTile = findViewById<CardView>(R.id.medical_tile)

        weatherTile.setOnClickListener{
            val intentWeather = Intent(this@MainActivity, WeatherActivity::class.java)
            startActivity(intentWeather)
        }
        locationTile.setOnClickListener{
            val intentLocation = Intent(this@MainActivity, MapsActivity::class.java)
            startActivity(intentLocation)
        }
        calculatorTile.setOnClickListener{
            val intentCalculator = Intent(this@MainActivity, CalculatorActivity::class.java)
            startActivity(intentCalculator)
        }
        medicalTile.setOnClickListener{
            Toast.makeText(applicationContext, "Medical", Toast.LENGTH_SHORT).show()
        }

    }

}