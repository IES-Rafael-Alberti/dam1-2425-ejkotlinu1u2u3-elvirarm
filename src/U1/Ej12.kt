package U1

/// Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.

fun pedirNumero (msj:String, min: Float? = null, max: Float? = null): Float {
    var numero: Float? = null

    do {
        println(msj)

        try {
            numero = readln().toFloat()

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

fun calcularIMC (peso:Float, altura:Float):Float{
    val imc = peso / (altura * altura)
    return imc
}

fun mostrarIMC (msj:String, imc: Float){
    println("$msj ${String.format("%.2f",imc)}")
}

fun main(){
    val peso = pedirNumero("Introduce tu peso en kg", 0f, 150f)
    val altura = pedirNumero ("Introduce tu altura en metros",0.50f,2.00f)
    val imc = calcularIMC(peso, altura)
    mostrarIMC("Tu índice de masa corporal es", imc)
}