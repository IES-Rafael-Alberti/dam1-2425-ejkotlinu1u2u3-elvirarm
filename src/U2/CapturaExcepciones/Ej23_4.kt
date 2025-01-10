package U2.CapturaExcepciones

// Escribir un programa que pida al usuario un número entero, si la entrada no es correcta, mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada.

fun pedirNumeroEntero(): Int{
    try{
        println("Introduce un número entero positivo")
        var num = readln().toInt()

        if (num < 0){
            println ("El número debe ser positivo")
            num = pedirNumeroEntero()
        }

        return num

    } catch(e:NumberFormatException){

        println("${e.message}La entrada no es correcta")
        pedirNumero()
    }
    return -1
}

fun main(){
    var num = pedirNumeroEntero()
}