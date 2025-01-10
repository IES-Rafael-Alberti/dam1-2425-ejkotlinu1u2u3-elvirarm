package com.dam1.ejercicioskotlin.U3.Conjuntos

//Dado el conjunto de letras:
//
//vocales = {'a', 'e', 'i', 'o', 'u'}
//
//Crea un conjunto consonantes que contenga las letras del alfabeto que no son vocales.
//Crea un conjunto letras_comunes que contenga las letras que están tanto en el conjunto vocales como en el conjunto consonantes.


fun letrasComunes(vocales:Set<Char>, consonantes: Set<Char>){
    val abecedario = vocales.union(consonantes).sorted()
    println("Las letras comunes son $abecedario")
}

fun Ej33_6(){
    val vocales = setOf<Char>('a', 'e', 'i', 'o', 'u')
    val consonantes = setOf<Char>('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')
    letrasComunes(vocales,consonantes)


}