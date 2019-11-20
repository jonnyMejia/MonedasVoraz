package com.diegoprojects.pruebacurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.function.DoubleToLongFunction


class activity_program : AppCompatActivity(),View.OnClickListener {
    var monto:EditText?=null
    var resultado:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)
        init()
    }
    fun init(){
        monto = findViewById(R.id.editVuelto) as EditText
        resultado=findViewById(R.id.txtFinal) as TextView
    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btnVuelto->escribirResult()
        }
    }
    fun escribirResult(){
        var salida=""
        for(moneda in Cambio().arrayCambio(Moneda().listaMonedas() ,23.3)){
            salida= salida+moneda.nombreMoneda.toString()+"->"+moneda.cantidad.toString()+"\n"
            resultado!!.setText(salida)
        }


    }
}
