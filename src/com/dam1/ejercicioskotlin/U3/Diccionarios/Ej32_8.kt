package com.dam1.ejercicioskotlin.U3.Diccionarios

fun pedirPalabras(): MutableMap<String, String> {
    val dicEspaniolIngles = mutableMapOf<String, String>()

    println("Introduce una palabra en español y su traducción en inglés separada con ':'. Para añadir una nueva palabra separalas por ',' Ejemplo 'Gato:cat, perro:dog': ")
    val palabrasDic = readLine() ?: ""
    val paresClaveValor = palabrasDic.split(",")
    for (par in paresClaveValor) {
        val (palabra, traduccion) = par.split(":").map { it.trim() }
        dicEspaniolIngles[palabra] = traduccion
    }
    return dicEspaniolIngles
}

fun pedirFrase(): String {
    println("Introduce una frase en español que quieras traducir: ")
    return readLine() ?: ""
}

fun separarFrase(fraseTraducir: String): List<String> {
    return fraseTraducir.split(" ")
}

fun traducirFrase(listFrase: List<String>, dicEspaniolIngles: MutableMap<String, String>): String {
    val fraseTraducida = mutableListOf<String>()

    for (palabra in listFrase) {
        if (dicEspaniolIngles.containsKey(palabra)) {
            fraseTraducida.add(dicEspaniolIngles[palabra] ?: palabra)
        } else {
            fraseTraducida.add(palabra)
        }
    }
    return fraseTraducida.joinToString(" ")
}

fun Ej32_8() {
    val dicEspaniolIngles = pedirPalabras()
    val fraseTraducir = pedirFrase()
    val listFrase = separarFrase(fraseTraducir)
    val fraseTraducida = traducirFrase(listFrase, dicEspaniolIngles)

    println(fraseTraducida)
}
