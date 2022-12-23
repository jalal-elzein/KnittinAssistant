package com.jalalelzein.knittingassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price)

        val oldText = findViewById<TextView>(R.id.txt_old)
        val newText = findViewById<TextView>(R.id.txt_new)
        val newPrice = findViewById<TextView>(R.id.txt_result_2)
        val oldHeight = findViewById<EditText>(R.id.edt_original_height)
        val oldWidth = findViewById<EditText>(R.id.edt_original_width)
        val oldPrice = findViewById<EditText>(R.id.edt_original_price)
        val newHeight = findViewById<EditText>(R.id.edt_new_height)
        val newWidth = findViewById<EditText>(R.id.edt_new_width)
        val calcButton = findViewById<Button>(R.id.btn_calc)

        calcButton.setOnClickListener {

            val oldArea = oldWidth.text.toString().toFloat() * oldHeight.text.toString().toFloat()
            val newArea = newWidth.text.toString().toFloat() * newHeight.text.toString().toFloat()

            val ratio = newArea / oldArea
            val nPrice = oldPrice.text.toString().toFloat() * ratio

            newPrice.text = nPrice.toString()

        }

    }
}