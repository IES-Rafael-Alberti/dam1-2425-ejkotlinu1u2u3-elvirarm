package U1

/// Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.

fun pedirFraseOriginal(msj: String): String {

    println(msj)
    val fraseOriginal: String = readln()

    return fraseOriginal
}

fun separarFrase(fraseOriginal: String): List<String>{

    val fraseSeparada = fraseOriginal.split(" ")

    return fraseSeparada
}

fun invertirFrase (fraseSeparada: List<String>): String{

    val vocal = fraseSeparada[1].reversed()

    return vocal
}

fun mostrarResultado (fraseSeparada: List<String>, vocal: String){

    println(fraseSeparada[0] + vocal)
}

fun main(){

    val fraseOriginal = pedirFraseOriginal("Introduce una frase y una vocal")
    val fraseSeparada = separarFrase(fraseOriginal)
    val vocal = invertirFrase(fraseSeparada)
    mostrarResultado(fraseSeparada, vocal)
}