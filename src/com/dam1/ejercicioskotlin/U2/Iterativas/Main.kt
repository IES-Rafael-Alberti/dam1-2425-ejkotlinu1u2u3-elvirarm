package com.dam1.ejercicioskotlin.U2.Iterativas

fun menuIterativas() {
    var salir = false

    do {
        println("\n===== MENÚ U2: Iterativas =====")
        println("1. Ej22_2")
        println("2. Ej22_4")
        println("3. Ej22_13")
        println("4. Ej22_18")
        println("5. Ej22_19")
        println("6. Ej22_25")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej22_2()
            2 -> Ej22_4()
            3 -> Ej22_13()
            4 -> Ej22_18()
            5 -> Ej22_19()
            6 -> Ej22_25()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}