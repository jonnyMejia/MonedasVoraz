package com.diegoprojects.pruebacurso
import java.lang.StringBuilder

class Moneda(){
    var nombre:String?=null
    var valor:Double?=null
constructor(nombre:String,valor:Double):this(){
    this.nombre=nombre
    this.valor=valor
}
       fun  listaMonedas(): Array<Moneda> {
        var moneda1= Moneda("10 centimos",0.1)
        var moneda2= Moneda("20 centimos",0.2)
        var moneda3= Moneda("50 centimos",0.5)
        var moneda4= Moneda("1 sol",1.0)
        var moneda5= Moneda("2 Soles",2.0)
        var moneda6= Moneda("5 Soles",5.0)
        var moneda7= Moneda("10 Soles",10.0)
        var moneda8= Moneda("20 Soles",20.0)
        var moneda9= Moneda("50 Soles",50.0)
        var moneda10= Moneda("100 Soles",100.0)
        var moneda11= Moneda("200 Soles",200.0)
        var monedas= arrayOf(moneda11,moneda10,moneda9,
            moneda8,moneda7,moneda6,moneda5,moneda4,
            moneda3,moneda2,moneda1
        )
        return monedas
          }


}
