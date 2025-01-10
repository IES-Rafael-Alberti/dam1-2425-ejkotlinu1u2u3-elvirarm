package com.dam1.ejercicioskotlin.U2.CapturaExcepciones

// Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.

fun pedirNumero(): Int{
    try{
        println("Introduce un número entero positivo")
        var num = readln().toInt()

        if (num < 0){
            println ("El número debe ser positivo")
            num = pedirNumero()
        }

        return num

        } catch(e:NumberFormatException){

        println("El número debe ser entero.")
        pedirNumero()
        }
        return -1
        }

fun mostrarNumerosImpares(num: Int){
    var serie = ""

    if (num % 2 == 0){
        for(i in 1.. num step 2){
            serie += "$i,"

        }
        println(serie.dropLast(1))
    }
    else{
        for(i in 1.. num step 2){
            serie += i
            serie += ","
            }
            println(serie.dropLast(1))
        }
    }
fun Ej23_2(){
    var num = pedirNumero()
    mostrarNumerosImpares(num)
}