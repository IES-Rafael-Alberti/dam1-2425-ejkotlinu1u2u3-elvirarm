///Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.



fun pedirNumero (msj:String, min: Int? = null, max: Int? = null): Int {
    var numero: Int? = null

    do {
        println(msj)

        try {
            numero = readln().toInt()

            if (min != null && numero < min) {
                throw NumberFormatException("*ERROR* El número debe ser mayor que $min!")
            }
            if (max != null && numero > max) {
                throw NumberFormatException("*ERROR* El número debe ser menor que $max!")
            }
        } catch (e: NumberFormatException) {
            if (numero == null) {
                println("Número no válido")
            } else {
                println(e)
            }
            numero = null
        }

    } while (numero == null)
    return numero
}

fun convertirTemperatura (numero:Int): Int{
    val gradosFarenheit = (numero * 9/5) + 32
    return gradosFarenheit
}

fun mostrarTemperatura (gradosFarenheit: Int){
    println ("Esta es tu temperatura en grados Farenheit: $gradosFarenheit")
}

fun main() {
    val numero = pedirNumero("Introduce un número", 1, 100)
    val gradosFarenheit = convertirTemperatura(numero)
    mostrarTemperatura(gradosFarenheit)
}