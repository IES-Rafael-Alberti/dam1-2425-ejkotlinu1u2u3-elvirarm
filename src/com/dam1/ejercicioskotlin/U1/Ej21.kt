package com.dam1.ejercicioskotlin.U1

/// Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.


fun pedirFrase(msj: String): String {

    println(msj)
    val frase: String = readln()

    return frase
}

fun invertirFrase(frase: String): String{

    val fraseInvertida = frase.reversed()

    return fraseInvertida
}

fun mostrarResultado (fraseInvertida: String){

    println(fraseInvertida)
}

fun Ej21(){
    val frase = pedirFrase("Introduce una frase")
    val fraseInvertida = invertirFrase(frase)
    mostrarResultado(fraseInvertida)
}