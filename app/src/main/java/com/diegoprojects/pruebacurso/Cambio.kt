package com.diegoprojects.pruebacurso

import android.nfc.Tag
import android.util.Log

class Cambio(){
    var nombreMoneda:String?=null
    var cantidad:Int?=null
    constructor(nombreMoneda:String, cantidad:Int):this(){
        this.nombreMoneda=nombreMoneda
        this.cantidad=cantidad
    }
    fun mostrarCambio(arreglo: ArrayList<Cambio>): String{
        var salida= StringBuilder()
        for(moneda in arreglo){
            salida.append("   ${moneda.nombreMoneda} -> ${moneda.cantidad}   " )
            salida.appendln()
        }
        return salida.toString()
    }
    fun init(monto: Double):String{
        return mostrarCambio(arrayCambio(Moneda().listaMonedas(),monto))
    }
    fun arrayCambio(listaMoneda: Array<Moneda> , monto:Double):ArrayList<Cambio>{
        var montito=monto
        var cambio:ArrayList<Cambio> = ArrayList()
        for( moneda in listaMoneda) {
            var cant=0
            while(moneda.valor!! <=montito) {
                montito -= moneda.valor!!
                cant++
            }
            if(cant!=0){
                cambio.add(Cambio(moneda.nombre!!,cant))
            }
        }
        return cambio
    }


}