package com.dam1.ejercicioskotlin.U1

/// Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.

fun pedirPrecio(msj: String): Float{

    println(msj)

    val precio = readln().toFloat()

    return precio
}

fun redondearPrecio(precio: Float): Float{

    val precioRedondeado = String.format("%.2f", precio).replace(",",".").toFloat()
    return precioRedondeado
}

fun separarPrecio(precioRedondeado: Float): List<String>{


    val precioSeparado = precioRedondeado.toString().split(".")
    return precioSeparado
}

fun mostrarResultado(precioSeparado: List<String>){

    println("Tienes ${precioSeparado[0]} euros y ${precioSeparado[1]} céntimos")
}

fun Ej24(){

    val precio = pedirPrecio("Introduce un precio con dos decimales")
    val precioRedondeado = redondearPrecio(precio)
    val precioSeparado = separarPrecio(precioRedondeado)
    mostrarResultado(precioSeparado)
}