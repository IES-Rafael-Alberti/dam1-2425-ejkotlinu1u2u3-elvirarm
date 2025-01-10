package com.dam1.ejercicioskotlin.U2.Iterativas

// Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de todos los números positivos ingresados.

fun pedirNumero(msj: String): Int{

    println(msj)
    var num = readln().toInt()
    return num
}

fun leerNumero(): Int{
    var salir: Boolean = false
    var serie = 0

    do{
        var num = pedirNumero("Introduce un número entero. Introduce 0 para terminar.")
        if (num > 0){
            serie += num
        }
        if (num == 0){
            salir = true
        }
    }
    while (salir == false)
    return serie
}

fun mostrarNumeros(serie: Int){
    println(serie)
}

fun Ej22_15(){

    var serie = leerNumero()
    mostrarNumeros(serie)

    }
