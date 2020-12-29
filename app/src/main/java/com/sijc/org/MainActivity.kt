package com.sijc.org

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //aqui mi codigo para resolver la suma de dos numeros y la multplicacion
        val operaciones = arrayOf("Sumar","Multiplicar")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,operaciones)
        spinner.adapter = adaptador

        //metodo del boton calcular
        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Sumar" -> txt_resultado.text = "La suma  es: ${
                    txt_num1.text.toString().toInt() + txt_num2.text.toString().toInt()
                }"
                "Multiplicar" -> txt_resultado.text = "El producto es: ${
                    txt_num1.text.toString().toInt() * txt_num2.text.toString().toInt()
                }"
            }
        }
    }
}