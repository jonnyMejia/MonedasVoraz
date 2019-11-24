package com.diegoprojects.pruebacurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.StringBuilder


class programActivity : AppCompatActivity(),View.OnClickListener {
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
        if (monto!!.text.isBlank()){
            Toast.makeText(getApplicationContext(),"Ingrese un monto porfavor!",Toast.LENGTH_SHORT).show()
        }else{
            var result = Cambio().init(monto!!.text.toString().toDouble())
            resultado?.setText("""$result""")
        }


    }
}
