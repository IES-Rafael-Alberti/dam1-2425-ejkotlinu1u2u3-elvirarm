package com.dam1.ejercicioskotlin.U3.Conjuntos


fun menuConjuntos() {
    var salir = false

    do {
        println("\n=== MENÚ CONJUNTOS ===")
        println("1. Ej33_2")
        println("2. Ej33_3")
        println("3. Ej33_4")
        println("4. Ej33_5")
        println("5. Ej33_6")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej33_2()
            2 -> Ej33_3()
            3 -> Ej33_4()
            4 -> Ej33_5()
            5 -> Ej33_6()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}