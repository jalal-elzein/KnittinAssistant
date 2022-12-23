package com.jalalelzein.knittingassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnPrice = findViewById<Button>(R.id.btn_price)
        val btnMeasurement = findViewById<Button>(R.id.btn_measurement)

        btnPrice.setOnClickListener {

            val switch = Intent(this@MenuActivity, PriceActivity::class.java)
            startActivity(switch)

        }

        btnMeasurement.setOnClickListener {

            val switch2 = Intent(this@MenuActivity, MainActivity::class.java)
            startActivity(switch2)

        }
    }
}