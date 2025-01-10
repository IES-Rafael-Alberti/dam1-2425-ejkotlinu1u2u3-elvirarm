package com.dam1.ejercicioskotlin.U2.Iterativas

fun pedirNumEntero(msj: String): Int {
    var salir: Boolean = false

    do {
        println(msj)
        var num = readln().toInt()

        when {
            (num > 0) -> return num
            (num == -1) -> return -1
            else -> println("El número introducido debe ser positivo o -1 para salir.")
        }

    } while (salir == false)
    return -1
}

fun sumarNumeros(num: Int) {
    var suma = 0
    for (digito in num.toString()) {
        suma += digito.toString().toInt()
    }
    println("La suma de los dígitos es: $suma")
}

fun Ej22_18() {
    var num = pedirNumEntero("Introduce números enteros positivos. Introduce -1 para salir.")
    var contadorPares = 0

    while (num != -1) {
        sumarNumeros(num)

        if (num % 2 == 0) {
            contadorPares++
        }

        num = pedirNumEntero("Introduce otro número o -1 para salir")
    }

    println("La cantidad de números pares ingresados fue: $contadorPares")
}
