package com.dam1.ejercicioskotlin.U2.CapturaExcepciones

fun menuCapturaExcepciones() {
    var salir = false

    do {
        println("\n===== MENÚ U2: Captura Excepciones =====")
        println("1. Ej23_2")
        println("2. Ej23_3")
        println("3. Ej23_4")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej23_2()
            2 -> Ej23_3()
            3 -> Ej23_4()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}