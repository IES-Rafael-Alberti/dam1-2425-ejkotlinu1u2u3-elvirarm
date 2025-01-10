package U3.Conjuntos

// Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela, finalizando cuando se introduzca “x”. A continuación, solicitar que introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.
//Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
//Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
//Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
//Mostrar si todos los nombres de primaria están incluidos en secundaria.

fun obtenerNombres(nivel: String): MutableSet<String>{

    var nombres: MutableSet<String> = mutableSetOf()
    var salir = false
    do{
        println("Introduce el nombre de un alumno de $nivel (o 'x' para terminar): ")
        var nombre = readln().lowercase()

        if (nombre != "x"){
        nombres.add(nombre)}
        else{
        salir = true}
    }while(!salir)

    return nombres
}

fun mostrarTodosLosAlumnos(primaria:MutableSet<String>, secundaria: MutableSet<String>){

    var todosLosAlumnos = primaria.union(secundaria)
    println("\nNombres de todos los alumnos (sin repeticiones): $todosLosAlumnos")}

fun mostrarNombresRepetidos(primaria:MutableSet<String>, secundaria: MutableSet<String>){

    var repetidos = primaria.intersect(secundaria)
    println("\nNombres repetidos entre primaria y secundaria: $repetidos")
}

 fun mostrarNombresSoloPrimaria(primaria:MutableSet<String>, secundaria: MutableSet<String>){

    var solo_primaria = primaria.subtract(secundaria)
    println("\nNombres de primaria que no se repiten en secundaria: $solo_primaria")
 }

fun main(){

    var primaria = obtenerNombres("primaria")
    var secundaria = obtenerNombres("secundaria")

    mostrarTodosLosAlumnos(primaria, secundaria)
    mostrarNombresRepetidos(primaria, secundaria)
    mostrarNombresSoloPrimaria(primaria, secundaria)}