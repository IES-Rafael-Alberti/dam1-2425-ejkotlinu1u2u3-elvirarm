package com.dam1.ejercicioskotlin

import com.dam1.ejercicioskotlin.U1.menuU1
import com.dam1.ejercicioskotlin.U2.menuU2
import com.dam1.ejercicioskotlin.U3.menuU3

fun main() {
    var salir = false

    do {
        println("\n===== MENÚ PRINCIPAL =====")
        println("1. Ejercicios U1")
        println("2. Ejercicios U2")
        println("3. Ejercicios U3")
        println("0. SALIR")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> menuU1()
            2 -> menuU2()
            3 -> menuU3()
            0 -> {
                salir = true
                println("Bye bye...")
            }
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}