package com.coldrosemob.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note01_edt = note01_edt
        val note02_edt = note02_edt
        val calculate_btn = calculate_btn
        val txtResultado = txtResultado

    }
}