package U2.Iterativas

//

fun preguntarEdad(msj: String): Int{
    println(msj)
    val edad = readln().toInt()
    return edad
}

fun mostrarEdad(edad: Int){
    var aniosCumplidos: Int = 0
    for (i in 1 .. edad){
        aniosCumplidos = i
        println(i)
    }
    println("Has cumplido $aniosCumplidos años")

}

fun main(){
    val edad = preguntarEdad("Introduce tu edad")
    mostrarEdad(edad)

}