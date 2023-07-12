package com.CristianArango.myapplication

class Reto {
}

fun main() {


    var dado1:Int=(1..6).random()
    var dado2:Int=(1..6).random()
    var suma:Int= dado1+dado2

    if (dado1  % 2 === 0 || dado2 % 2 === 0){
    println("Felicitacion usted gano porque uno de los dos dados callo un numero par, los dados son $dado1 $dado2")
    }
    else if(suma==3){
        println("Felicitaciones los dados sumas 3 ya que calleron $dado1 $dado2")
    }
    else if (suma==1){
        println("Felicitaciones los dados sumas 11 ya que calleron $dado1 $dado2")
    }
    else if (suma==2||suma==12){
        println("Felicitaciones los dados 2 o 12 calleron $dado1 $dado2")
    }
    else if (suma==7){
        println("Felicitaciones los dados sumas 2 ya que calleron $dado1 $dado2")
    }
    else{
        println("PERDIO YA QUE CALLO $dado1 $dado2")
    }


print(dado1)
    print(dado2)

}