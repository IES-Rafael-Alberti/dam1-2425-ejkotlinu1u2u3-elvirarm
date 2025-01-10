package com.dam1.ejercicioskotlin.U3.Diccionarios

// Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre una persona (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario. Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.

fun pedirDatos(): MutableMap<String, Any> {
    val diccionarioDatos = mutableMapOf<String, Any>()

    println("Introduce tu nombre: ")
    val nombre = readln()
    diccionarioDatos["Nombre"] = nombre
    imprimirDiccionario(diccionarioDatos)

    println("Introduce tu edad: ")
    val edad = readln()
    diccionarioDatos["Edad"] = edad
    imprimirDiccionario(diccionarioDatos)

    println("Introduce tu sexo: ")
    val sexo = readln()
    diccionarioDatos["Sexo"] = sexo
    imprimirDiccionario(diccionarioDatos)

    println("Introduce tu teléfono: ")
    val telefono = readln()
    diccionarioDatos["Teléfono"] = telefono
    imprimirDiccionario(diccionarioDatos)

    println("Introduce tu correo electrónico: ")
    val correo = readln()
    diccionarioDatos["Correo"] = correo
    imprimirDiccionario(diccionarioDatos)

    return diccionarioDatos
}

fun imprimirDiccionario(diccionarioDatos: MutableMap<String, Any>) {
    println("Diccionario actualizado: $diccionarioDatos")
}

fun Ej32_6() {
    val datosPersona = pedirDatos()
}