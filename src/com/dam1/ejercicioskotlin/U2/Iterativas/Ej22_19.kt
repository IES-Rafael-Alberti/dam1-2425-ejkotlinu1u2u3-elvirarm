package com.dam1.ejercicioskotlin.U2.Iterativas

// Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa. A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.

fun mostrarMenu(){
    println("MENÚ \n 1- comenzar programa \n 2- imprimir listado \n 3- finalizar programa")

}

fun elegirOpcion(msj: String): Int {

    var opcion: Int? = null
    do {
        println(msj)
        opcion = readln().toInt()

        if (opcion != null) {
            when (opcion) {

                1 -> println("Has iniciado el programa.")
                2 -> println("Listado impreso.")
                3 -> println("Saliendo del programa...")
                else -> {
                    println("La opción debe ser 1,2 o 3")
                    opcion = null
                }
            }

        }

    } while (opcion == null)
    return opcion

}



fun Ej22_19(){
    var salir = false
    while (!salir){
        mostrarMenu()
        var opcion = elegirOpcion("Elige entre las opciones 1, 2 o 3.")
        if (opcion == 3){
            salir = true
        }
    }
}