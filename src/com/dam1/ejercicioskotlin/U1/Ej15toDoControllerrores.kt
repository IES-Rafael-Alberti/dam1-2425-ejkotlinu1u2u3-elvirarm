
package com.dam1.ejercicioskotlin.U1

/// Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.


fun leerCantidadDinero (msj:String): Float {
    val dineroInicial: Float = pedirNumero(msj)
    return dineroInicial
}

fun pedirNumero(msj: String): Float {
    print(msj)
    val cadena = readln()
    val numero = comprobarNumero(cadena, msj)
    return numero
}

fun comprobarNumero(numero: String, msj: String): Float {
    var dineroInicial: Float? = null
    try {
        dineroInicial = numero.toFloat()

        if (dineroInicial < 0) {
            throw NumberFormatException("Debes introducir una cantidad mayor que 0.")
        }
    } catch (e: NumberFormatException) {
        if (dineroInicial == null) {
            println("Número no válido")
        } else {
            println(e)
        }
        dineroInicial = pedirNumero(msj)
    }
    return dineroInicial!!
}

fun calcularInteres (dineroInicial:Float){
    var dineroConInteres = dineroInicial

    for ( i in 1..4){
        var interesPorAnio = (dineroConInteres * 0.4f)
        println("El ahorro tras el año $i es de %.2f euros y el total acumulado es %.2f euros".format(interesPorAnio, dineroConInteres))
        dineroConInteres += interesPorAnio

    }
}

fun Ej15toDoControllerrores(){
    var dineroInicial = leerCantidadDinero("Introduce el dinero depositado en la cuenta de ahorros inicialmente: ")
    var dineroConInteres = calcularInteres(dineroInicial)
}
