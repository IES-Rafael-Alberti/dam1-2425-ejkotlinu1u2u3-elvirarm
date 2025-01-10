package com.dam1.ejercicioskotlin.U3.Conjuntos

// Dado el conjunto de números enteros:
//
//numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//
//Crea un conjunto pares que contenga los números pares del conjunto numeros.
//Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos de tres del conjunto numeros.
//Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y guárdala en un conjunto llamado pares_y_multiplos_de_tres.

fun conjuntoPares(numeros: Set<Int>): Set<Int>{
    var pares = mutableSetOf<Int>()

    for (numero in numeros){
        if (numero %2 == 0){
            pares.add(numero)}}

    return pares
}


fun conjunto_multiplo_tres(numeros: Set<Int>): Set<Int>{
    var multiploTres = mutableSetOf<Int>()

    for (numero in numeros){
        if (numero %3 == 0){
            multiploTres.add(numero)}
    }

    return multiploTres
}

fun interseccionConjuntos(pares: Set<Int>, multiploTres: Set<Int>): Set<Int>{
    var paresMultiplosDeTres = pares.intersect(multiploTres)

    return paresMultiplosDeTres
}

fun Ej33_5(){
    var numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var pares = conjuntoPares(numeros)
    println("Los números pares del conjunto numero son: $pares")

    var multiploTres = conjunto_multiplo_tres(numeros)
    println ("Los números que son múltiplos de tres son: $multiploTres")

    var paresMultiplosDeTres = interseccionConjuntos(pares, multiploTres)
    println ("La intersección entre los conjuntos pares y múltiplos de tres son: $paresMultiplosDeTres")
}
