package com.dam1.ejercicioskotlin.U2.Iterativas

// Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de una, mostrar la primera) y cuántas palabras había. Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más.


fun pedirFrase(): String{
    println("Escribe una frase: ")
    val frase = readln()
    return frase
}

fun separarFrase(frase: String): List<String>{
    val fraseSeparada = frase.split(Regex("\\s+"))
    // s+ sirve para que si encuentra más de 1 espacio se cuente como 1
    return fraseSeparada
}

fun contarPalabras(fraseSeparada: List<String>): Pair<Int, String> {
    var longitud_palabra = 0
    var palabraMasLarga = ""
    var cantidadPalabras = 0

    for (palabra in fraseSeparada) {
        cantidadPalabras += 1
        if (palabra.length > longitud_palabra) {
            palabraMasLarga = palabra
        }
    }
    return Pair(cantidadPalabras, palabraMasLarga)
    }

    fun mostrarResultado(cantidadPalabras: Int, palabraMasLarga: String){
        println("La palabra más larga es: $palabraMasLarga y había $cantidadPalabras palabras.")
    }

    fun Ej22_25() {
        val frase = pedirFrase()
        val fraseSeparada = separarFrase(frase)
        val (cantidadPalabras, palabraMasLarga) = contarPalabras(fraseSeparada)
        mostrarResultado(cantidadPalabras, palabraMasLarga)
    }