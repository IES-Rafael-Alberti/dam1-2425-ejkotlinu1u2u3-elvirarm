package U2.CapturaExcepciones

// Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas. Deberá solicitar el número hasta introducir uno correcto.

fun mostrarCuentaAtras(num:Int){
    var serie = ""
    for (i in num downTo 0){
        serie += "$i,"
    }
    println(serie.dropLast(1))

}

fun main(){
    var num = pedirNumero()
    mostrarCuentaAtras(num)
}