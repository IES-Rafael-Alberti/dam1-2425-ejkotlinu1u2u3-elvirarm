package com.dam1.ejercicioskotlin.U1

fun menuU1() {
    var salir = false

    do {
        println("\n===== MENÚ U1 =====")
        println("1. Ej04")
        println("2. Ej06")
        println("3. Ej12")
        println("4. Ej15toDoControllererrores")
        println("5. Ej18")
        println("6. Ej20")
        println("7. Ej21")
        println("8. Ej22")
        println("9. Ej24")
        println("10. Ej25toDo")
        println("0. VOLVER")
        print("Selecciona una opción: ")

        when (readln().toIntOrNull()) {
            1 -> Ej04()
            2 -> Ej06()
            3 -> Ej12()
            4 -> Ej15toDoControllerrores()
            5 -> Ej18()
            6 -> Ej20()
            7 -> Ej21()
            8 -> Ej22()
            9 -> Ej24()
            10 -> Ej25toDo()
            0 -> salir = true
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (!salir)
}