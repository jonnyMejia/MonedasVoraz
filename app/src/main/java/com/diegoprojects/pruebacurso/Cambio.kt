package com.diegoprojects.pruebacurso

class Cambio(){
    var nombreMoneda:String?=null
    var cantidad:Int?=null
    constructor(nombreMoneda:String, cantidad:Int):this(){
        this.nombreMoneda=nombreMoneda
        this.cantidad=cantidad

    }
    fun mostrarCambio(arreglo: Array<Cambio>): String{
        var salida= ""
        for(moneda in arreglo){
            salida= salida+moneda.nombreMoneda.toString()+"->"+moneda.cantidad.toString()+"\n"
        }
        return salida
    }
    fun init(monto: Double):String{
        return mostrarCambio(arrayCambio(Moneda().listaMonedas(),monto))
    }
    fun arrayCambio(listaMoneda: Array<Moneda> , monto:Double):Array<Cambio>{
        var montito=monto
        var cambio:Array<Cambio> = arrayOf()
        for( moneda in listaMoneda) {
            var cant=0
            while(moneda.valor!! <=montito) {
                montito -= moneda.valor!!
                cant++
            }
            cambio.plusElement(Cambio(moneda.nombre!!,cant))
        }
        return cambio
    }


}