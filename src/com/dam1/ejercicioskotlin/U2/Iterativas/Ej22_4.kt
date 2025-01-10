package com.dam1.ejercicioskotlin.U2.Iterativas

//

fun pedirEntero(msj: String): Int{
    println(msj)
    var num = readln().toInt()

    return num
}

fun mostrarEntero(num: Int){

    var serie = ""
    for (i in num downTo 0 ){
        if (serie != "")
            serie += ","
        serie += i
    }
    println(serie)

}

fun Ej22_4(){
    var num = pedirEntero("Introduce un número entero.")
    mostrarEntero(num)
}