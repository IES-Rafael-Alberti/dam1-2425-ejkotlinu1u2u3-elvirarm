package com.dam1.ejercicioskotlin.U2.Condicionales

fun menuCondicionales() {
    var salir = false

    do {
        println("\n===== MENÚ U2: Condicionales =====")
        println("1. Ej21_2")
        println("2. Ej21_3")
        println("3. Ej21_6")
        println("4. Ej21_8")
        println("5. Ej21_10")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej21_2()
            2 -> Ej21_3()
            3 -> Ej21_6()
            4 -> Ej21_8()
            5 -> Ej21_10()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}
