package com.dam1.ejercicioskotlin.U3


import com.dam1.ejercicioskotlin.U3.Conjuntos.menuConjuntos
import com.dam1.ejercicioskotlin.U3.Diccionarios.menuDiccionarios
import com.dam1.ejercicioskotlin.U3.ListasyTuplas.menuListasYTuplas

fun menuU3() {
    var salir = false

    do {
        println("\n===== MENÚ U3 =====")
        println("1. Conjuntos")
        println("2. Diccionarios")
        println("3. Listas y Tuplas")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> menuConjuntos()
            2 -> menuDiccionarios()
            3 -> menuListasYTuplas()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}
