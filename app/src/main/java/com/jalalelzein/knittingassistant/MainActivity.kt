package com.jalalelzein.knittingassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalc = findViewById<Button>(R.id.btn_calculate)
        val edtOldSize1 = findViewById<EditText>(R.id.edt_old_size_1)
        val edtOldSize2 = findViewById<EditText>(R.id.edt_old_size_2)
        val edtNewSize1= findViewById<EditText>(R.id.edt_new_size_1)
        val txtResult = findViewById<TextView>(R.id.txt_result)

        btnCalc.setOnClickListener {

            val os1 = edtOldSize1.text.toString().toFloat()
            val os2 = edtOldSize2.text.toString().toFloat()
            val ns1 = edtNewSize1.text.toString().toFloat()

            val ratio:Float = ns1 / os1
            val result = ratio * os2

            txtResult.text = result.toString()

        }

    }


}