/// Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.

fun preguntarDatos(): Pair<String, String>{
    println("Introduce tu nombre: ")
    val nombre = readln().lowercase()

    println("Introduce tu sexo: ")
    val sexo = readln().lowercase()

    return Pair(nombre, sexo)
}

fun clasificarDatos(nombre: String, sexo: String){
    when{
        (sexo == "femenino" || sexo == "f" || sexo == "mujer") && ( nombre[0] < 'm') -> println("Perteneces al grupo A")
        (sexo == "masculino" || sexo == "m" || sexo == "hombre") && (nombre[0] > 'n')  -> println("Perteneces al grupo A")
        else -> println("Perteneces al grupo B")
    }

    }

fun main(){
    val datos = preguntarDatos()
    clasificarDatos(datos.first, datos.second)

}
