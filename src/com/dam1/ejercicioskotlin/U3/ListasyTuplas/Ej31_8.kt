package com.dam1.ejercicioskotlin.U3.ListasyTuplas

// Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.

fun pedirPalabra(): String{
    println("Introduce una palabra: ")
    val palabra = readln().lowercase()
    return palabra
}

fun esPalindromo(palabra: String){
    var palabraLista = mutableListOf<Char>()
    for (letra in palabra){
        palabraLista.add(letra)
    }

    var palabraReves = palabraLista.reversed()

    if (palabraLista == palabraReves){
        println("$palabra es palíndromo")

    }else{
        println("$palabra no es palíndromo")
    }
}

fun Ej31_8(){
    val palabra = pedirPalabra()
    esPalindromo(palabra)
}