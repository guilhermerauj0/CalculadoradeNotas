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

        calculate_btn.setOnClickListener{
            val note01 = (note01_edt.text.toString()).toFloat()
            val note02 = (note02_edt.text.toString()).toFloat()
            val media = (note01 + note02)/2
            val fouls = Integer.parseInt(foul_edt.text.toString())

            if(media >= 6 && fouls <= 10){
                txtResultado.setText("Student Approved" + "\n" + "Note Final: " + media + "\n"+ "Fouls: " +fouls)
            } else{

                txtResultado.setText("Student Disapproved" + "\n" + "Note Final: " + media + "\n"+ "Fouls: " +fouls)
            }
        }

    }
}