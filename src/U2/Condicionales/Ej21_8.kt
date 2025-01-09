package U2.Condicionales

// En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas. A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel. Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, así como la cantidad de dinero que recibirá el usuario

fun preguntarPuntuacion(msj: String): Float {
    var puntuacionUsuario: Float = 0.0f
    var puntuacionValida = false

    do {
        try {
            println(msj)
            puntuacionUsuario = readln().toFloat()

            if (puntuacionUsuario == 0.0f || puntuacionUsuario == 0.4f || puntuacionUsuario >= 0.6f) {
                puntuacionValida = true
            } else {
                println("La puntuación debe ser 0.0, 0.4, o mayor o igual a 0.6. Inténtelo de nuevo.")
            }

        } catch (e: NumberFormatException) {
            println("Entrada inválida, introduce un número decimal.")
        }
    } while (puntuacionValida == false)

    return puntuacionUsuario
}

fun determinarNivel(puntuacionUsuario: Float): String {
    var nivelUsuario = ""
    when {
        puntuacionUsuario == 0.0f -> nivelUsuario = "Inaceptable"
        puntuacionUsuario == 0.4f -> nivelUsuario = "Aceptable"
        puntuacionUsuario >= 0.6f -> nivelUsuario = "Meritorio"
        else -> println("Puntuación no válida")
    }
    return nivelUsuario
}

fun calcularDinero(puntuacionUsuario: Float) : String {
    val dineroObtenido: Float =  2400 * puntuacionUsuario
    dineroObtenido.toString()
    val dineroObtenidoRedondeado = String.format("%.2f", dineroObtenido)
    return dineroObtenidoRedondeado
}

fun mostrarResultado(puntuacionUsuario: Float, nivelUsuario: String, dineroObtenidoRedondeado: String){
    println("El nivel del usuario es $puntuacionUsuario con un rendimiento ${nivelUsuario.lowercase()} y recibe $dineroObtenidoRedondeado euros. ")
}

fun main(){
    val puntuacionUsuario = preguntarPuntuacion("Introduce la puntuación del usuario")
    var nivelUsuario = determinarNivel(puntuacionUsuario)
    val dineroObtenidoRedondeado = calcularDinero(puntuacionUsuario)
    mostrarResultado(puntuacionUsuario, nivelUsuario, dineroObtenidoRedondeado)

}