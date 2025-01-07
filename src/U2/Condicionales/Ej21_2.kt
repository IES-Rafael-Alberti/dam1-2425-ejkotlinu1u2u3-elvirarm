package U2.Condicionales

/// Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas

fun pedirContrasenia(msj: String): String{

    println(msj)
    var contraseniaUsuario = readln().lowercase()
    return contraseniaUsuario
}

fun compararContrasenias(contraseniaOriginal: String, contraseniaUsuario: String): Boolean{

    var contraseniaCorrecta: Boolean = false
    var contraseniaTemp = contraseniaUsuario

    do{
        if (contraseniaUsuario != contraseniaOriginal){
            contraseniaTemp = pedirContrasenia("La contraseña no coincide, inténtelo de nuevo")
            contraseniaCorrecta = compararContrasenias(contraseniaOriginal, contraseniaTemp)
        }
        else {
            contraseniaCorrecta = true
            println(contraseniaUsuario)
        }

    } while (contraseniaCorrecta == false)

    return contraseniaCorrecta
}


fun main(){
    val contraseniaOriginal: String = "contraseña".lowercase()

    var contraseniaUsuario = pedirContrasenia("Introduce una contraseña")
    var contraseniaCorrecta = compararContrasenias(contraseniaOriginal, contraseniaUsuario)
}