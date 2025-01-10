package com.dam1.ejercicioskotlin.U3.ListasyTuplas

//Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.




fun contarVocales(palabra: String) {
    var contadorA = 0
    var contadorE = 0
    var contadorI = 0
    var contadorO = 0
    var contadorU = 0

    for (letra in palabra) {
        when (letra) {
            'a' -> contadorA++
            'e' -> contadorE++
            'i' -> contadorI++
            'o' -> contadorO++
            'u' -> contadorU++
        }
    }
    println("La vocal 'a' aparece $contadorA veces.")
    println("La vocal 'e' aparece $contadorE veces.")
    println("La vocal 'i' aparece $contadorI veces.")
    println("La vocal 'o' aparece $contadorO veces.")
    println("La vocal 'u' aparece $contadorU veces.")
}

fun Ej31_9(){
    var palabra = pedirPalabra()
    palabra = palabra.lowercase()
    contarVocales(palabra)
}

