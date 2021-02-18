package com.example.treinamentocalculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCalcular:Button = calcular

        botaoCalcular.setOnClickListener {
            val media:Int = (Integer.parseInt(nota1.text.toString()) + Integer.parseInt(nota2.text.toString()))/2
            val falta = Integer.parseInt(faltas.text.toString())
            if(media>=6 &&  falta <=1){
                resultado.setText("Aluno foi aprovado \n Nota Final: $media \n Faltas: $falta")
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("Aluno foi Reprovado \n Nota Final: $media \n Faltas: $falta")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}