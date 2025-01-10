
package com.dam1.ejercicioskotlin.U3.Diccionarios

fun menuDiccionarios() {
    var salir = false

    do {
        println("\n=== MENÚ DICCIONARIOS ===")
        println("1. Ej32_6")
        println("2. Ej32_7")
        println("3. Ej32_8")
        println("4. Ej32_10")
        println("5. Ej32_11")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej32_6()
            2 -> Ej32_7()
            3 -> Ej32_8()
            4 -> Ej32_10()
            5 -> Ej32_11()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}