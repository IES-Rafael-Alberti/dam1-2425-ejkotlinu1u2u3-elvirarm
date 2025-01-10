package com.dam1.ejercicioskotlin.U2

import com.dam1.ejercicioskotlin.U2.CapturaExcepciones.menuCapturaExcepciones

import com.dam1.ejercicioskotlin.U2.Condicionales.menuCondicionales

import com.dam1.ejercicioskotlin.U2.Iterativas.menuIterativas


fun menuU2() {
    var salir = false

    do {
        println("\n===== MENÚ U2 =====")
        println("1. Captura Excepciones")
        println("2. Condicionales")
        println("3. Iterativas")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> menuCapturaExcepciones()
            2 -> menuCondicionales()
            3 -> menuIterativas()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}