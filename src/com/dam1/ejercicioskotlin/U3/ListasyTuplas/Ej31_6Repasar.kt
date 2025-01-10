package com.dam1.ejercicioskotlin.U3.ListasyTuplas

// Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.

fun listaAsignaturas(): MutableList<String> {
    return mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
}

fun preguntarNota(asignaturas: List<String>): List<Float> {
    val notas = mutableListOf<Float>()
    for (asignatura in asignaturas) {
        println("¿Cuánto has sacado en $asignatura?")
        val nota = readln().toFloat()
        notas.add(nota)
    }
    return notas
}

fun mostrarSuspendidas(asignaturas: List<String>, notas: List<Float>) {
    var asignaturaSuspendida = false

    for (i in asignaturas.indices) {
        if (notas[i] < 5) {
            println("Tienes que repetir la asignatura: ${asignaturas[i]}")
            asignaturaSuspendida = true
        }
    }

    if (!asignaturaSuspendida) {
        println("No hay asignaturas suspensas")
    }
}

fun obtenerAsignaturasSuspendidas(asignaturas: List<String>, notas: List<Float>): List<String> {
    val asignaturasSuspendidas = mutableListOf<String>()

    // Añadir a la lista solo las asignaturas que tienen una nota menor a 5
    for (i in asignaturas.indices) {
        if (notas[i] < 5) {
            asignaturasSuspendidas.add(asignaturas[i])
        }
    }

    return asignaturasSuspendidas
}

fun Ej31_6Repasar() {
    val asignaturas = listaAsignaturas()

    val notas = preguntarNota(asignaturas)

    // Obtenemos la lista de asignaturas suspendidas
    val asignaturasSuspendidas = obtenerAsignaturasSuspendidas(asignaturas, notas)

    // Mostramos las asignaturas que el usuario tiene que repetir
    if (asignaturasSuspendidas.isNotEmpty()) {
        println("Las asignaturas que tienes que repetir son: ${asignaturasSuspendidas.joinToString(", ")}")
    } else {
        println("No tienes asignaturas suspensas.")
    }
}
