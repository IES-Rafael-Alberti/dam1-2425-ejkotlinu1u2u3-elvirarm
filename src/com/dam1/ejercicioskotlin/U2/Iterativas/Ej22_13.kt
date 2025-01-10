package com.dam1.ejercicioskotlin.U2.Iterativas

// Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará.

fun pedirPalabra(msj: String): String{
    println(msj)
    var palabra = readln()
    return palabra
}

fun mostrarEco(){
    var salir: Boolean = false

    do {
        var palabra = pedirPalabra("Introduce la palabra que quieres que se repita. Introduce 'salir' para salir")
        if (palabra == "salir"){
            salir = true}
        else{
            println(palabra)
        }
    }while(salir == false)

}

fun Ej22_13(){
    mostrarEco()
}