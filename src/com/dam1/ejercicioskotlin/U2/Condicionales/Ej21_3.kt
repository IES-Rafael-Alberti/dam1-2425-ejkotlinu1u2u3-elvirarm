package com.dam1.ejercicioskotlin.U2.Condicionales

/// Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.


fun pedirNumeros(): Pair<Float, Float>{
    println("Introduce el dividendo: ")
    val dividendo = readln().toFloat()

    println("Introduce el divisor: ")
    val divisor = readln().toFloat()
    if (divisor.toInt() == 0){
        println("**ERROR** El divisor no puede ser 0")
        return pedirNumeros()
    } else {
        return Pair(divisor,dividendo)
    }
}

fun hacerDivision(divisor: Float, dividendo: Float): Float {
    val resultado = dividendo / divisor
    return resultado
}

fun Ej21_3(){
    val numeros = pedirNumeros()
    val resultado = hacerDivision(numeros.first, numeros.second)
    println(resultado)
}