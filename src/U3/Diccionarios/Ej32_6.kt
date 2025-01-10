package U3.Diccionarios

// Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre una persona (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario. Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.

fun pedirDatos(): List<Any>{

    val datosPersona = mutableListOf<Any>()

    println("Introduce tu nombre: ")
    val nombre = readln()
    datosPersona.add(nombre)
    llenarDiccionario(datosPersona)

    println("Introduce tu edad: ")
    val edad = readln()
    datosPersona.add(edad)
    llenarDiccionario(datosPersona)

    println("Introduce tu sexo: ")
    val sexo = readln()
    datosPersona.add(sexo)
    llenarDiccionario(datosPersona)

    println("Introduce tu teléfono: ")
    val telefono = readln()
    datosPersona.add(telefono)
    llenarDiccionario(datosPersona)

    println("Introduce tu correo electrónico: ")
    val correo = readln()
    datosPersona.add(correo)
    llenarDiccionario(datosPersona)


    return datosPersona
}


fun llenarDiccionario(datosPersona: List<Any>) {
    val claves = listOf("Nombre", "Edad", "Sexo", "Teléfono", "Correo")

    var diccionarioDatos: MutableMap<String, Any> = mutableMapOf()

    for (i in datosPersona.indices){
        diccionarioDatos[claves[i]] = datosPersona[i]
    }
    println("Diccionario actualizado: $diccionarioDatos")

}
fun main(){
    val datosPersona = pedirDatos()
}