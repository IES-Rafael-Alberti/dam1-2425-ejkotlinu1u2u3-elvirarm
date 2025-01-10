package com.dam1.ejercicioskotlin.U3.ListasyTuplas

fun menuListasYTuplas() {
    var salir = false

    do {
        println("\n=== MENÚ LISTAS Y TUPLAS ===")
        println("1. Ej31_6Repasar")
        println("2. Ej31_8")
        println("3. Ej31_9")
        println("4. Ej31_10")
        println("5. Ej31_13ToDo")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej31_6Repasar()
            2 -> Ej31_8()
            3 -> Ej31_9()
            4 -> Ej31_10()
            5 -> Ej31_13ToDo()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}