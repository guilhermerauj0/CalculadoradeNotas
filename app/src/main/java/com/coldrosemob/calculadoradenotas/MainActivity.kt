package com.coldrosemob.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val note01_edt: EditText = findViewById(R.id.note01_edt)
        val note02_edt: EditText = findViewById(R.id.note02_edt)
        val calculate_btn: Button = findViewById(R.id.calculate_btn)

    }
}