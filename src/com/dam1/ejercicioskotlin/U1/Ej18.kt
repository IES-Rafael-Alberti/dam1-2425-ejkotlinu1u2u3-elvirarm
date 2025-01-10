package com.dam1.ejercicioskotlin.U1

/// Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.

fun pedirNombre():String?{
    var nombreCompleto: String? = null
    var nombreCorrecto = false

    do{
        println("Introduce tu nombre completo: ")
        nombreCompleto = readln().trim().lowercase()

        nombreCorrecto = comprobarString(nombreCompleto)

    } while (!nombreCorrecto)

    return nombreCompleto
}

fun comprobarString(nombreCompleto:String?):Boolean {


    if (nombreCompleto.isNullOrBlank()) {
        println("El campo no puede estar vacío")
        return false
    }
    if (nombreCompleto.all { it.isLetter() || it.isWhitespace() }) {
        return true
    } else {
        println("El nombre solo puede contener letras y espacios")
        return false
    }
}

fun mostrarNombre(nombreCompleto:String){
    var nombre = nombreCompleto

    for (i in 1..3) {
        when (i) {
            1 -> nombre = nombreCompleto.lowercase()
            2 -> nombre = nombreCompleto.uppercase()
            3 -> nombre = toCapitalize(nombreCompleto)
        }
        println(nombre)
    }
}

fun toCapitalize(nombreCompleto: String): String {
    val cadenas = nombreCompleto.split(" ")
    var nombreCapitalizado = ""
    for (str in cadenas) {
        if(nombreCapitalizado != "") {
            nombreCapitalizado += " "
        }
        nombreCapitalizado += str.capitalize()
    }
    return nombreCapitalizado
}

fun Ej18(){
    var nombreCompleto = pedirNombre()
    mostrarNombre(nombreCompleto!!)
}