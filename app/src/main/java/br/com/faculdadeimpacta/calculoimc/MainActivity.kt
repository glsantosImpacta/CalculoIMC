package br.com.faculdadeimpacta.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularIMC(view: View){

        var peso = et_peso.text.toString().toDouble()
        var altura = et_altura.text.toString().toDouble().pow(2)
        var resultado = peso / altura

        if(resultado < 18.5){
            // abaixo do peso
            tv_resultado.setText("Abaixo do peso")
        }
        if(resultado >= 18.5 && resultado <= 24.9){
           // peso normal
            tv_resultado.setText("Peso normal")
        }
        if(resultado >= 25 && resultado <= 29.9){
            // sobrepeso
            tv_resultado.setText("Sobrepeso")
        }
        if(resultado >= 30 && resultado <= 34.9){
            // obesidade grau 1
            tv_resultado.setText("Obesidade grau 1")
        }
        if(resultado >= 35 && resultado <= 39.9){
            // obesidade grau 2
            tv_resultado.setText("Obesidade grau 2")
        }
        if(resultado >= 40){
            // obesidade grau 3
            tv_resultado.setText("Obesidade grau 3")
        }
    }
}
