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
        val travelTile = findViewById<CardView>(R.id.travel_tile)
        val educationTile = findViewById<CardView>(R.id.education_tile)
        val medicalTile = findViewById<CardView>(R.id.medical_tile)

        weatherTile.setOnClickListener{
            val intent = Intent(this@MainActivity, WeatherActivity::class.java)
            startActivity(intent)
        }
        travelTile.setOnClickListener{
            Toast.makeText(applicationContext, "Travel", Toast.LENGTH_SHORT).show()
        }
        educationTile.setOnClickListener{
            Toast.makeText(applicationContext, "Education", Toast.LENGTH_SHORT).show()
        }
        medicalTile.setOnClickListener{
            Toast.makeText(applicationContext, "Medical", Toast.LENGTH_SHORT).show()
        }

    }

}