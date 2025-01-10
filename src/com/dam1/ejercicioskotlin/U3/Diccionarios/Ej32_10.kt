package com.dam1.ejercicioskotlin.U3.Diccionarios





fun mostrarMenu() {
    println("Elige una opción de las siguientes:")
    println("(1) Añadir cliente")
    println("(2) Eliminar cliente")
    println("(3) Mostrar cliente")
    println("(4) Listar todos los clientes")
    println("(5) Listar clientes preferentes")
    println("(6) Terminar")
}

fun elegirOpcion(): String{
    println("Elige una opción: 1, 2, 3, 4, 5 o 6: ")
    var opcion = readln()
    return opcion
}

fun pedirDatosClientes(): Map<String, Any> {
    println("Introduce los datos del cliente separados por comas (nombre, dirección, teléfono, correo y preferente [sí/no]):")
    val entrada = readLine().toString()
    val (nombre, direccion, telefono, correo, preferente) = entrada.split(",").map { it.trim() }

    return mapOf(
        "nombre" to nombre,
        "direccion" to direccion,
        "teléfono" to telefono,
        "correo" to correo,
        "preferente" to (preferente.lowercase() in listOf("sí", "si")
    ))
}
fun mostrarDatos(bd_clientes: MutableMap<String, Map<String, Any>>) {
    val nif_cliente = preguntarNif()
    if (bd_clientes.containsKey(nif_cliente)) {
        println("Datos del cliente $nif_cliente: ${bd_clientes[nif_cliente]}")
    } else {
        println("El NIF no se encuentra en la base de datos.")
    }
}

fun preguntarNif():String{
        println("Introduce el NIF del cliente: ")

        return readln().trim()}

fun eliminarDatos(bd_clientes: MutableMap<String, Map<String, Any>>){
    var nif_cliente = preguntarNif()
    if (nif_cliente in bd_clientes){
        bd_clientes.remove(nif_cliente)
    println("Cliente con NIF $nif_cliente eliminado.")}
        else{
            print("El NIF no se encuentra en la base de datos.")}
}

fun listarClientes(bd_clientes: MutableMap<String, Map<String, Any>>) {
    if (bd_clientes.isNotEmpty()) {
        println("\nLista de todos los clientes:")
        for ((nif, datos) in bd_clientes) {
            println("NIF: $nif, Nombre: ${datos["nombre"]}")
        }
    } else {
        println("No hay clientes en la base de datos.")
    }
}

fun listarPreferentes(bd_clientes: MutableMap<String, Map<String, Any>>) {

    val preferentes = bd_clientes.filter { it.value["preferente"] == true }

    if (preferentes.isNotEmpty()) {
        println("\nLista de clientes preferentes:")
        for ((nif, datos) in preferentes) {
            println("NIF: $nif, Nombre: ${datos["nombre"]}")
        }

    } else {
        println("No hay clientes preferentes en la base de datos.")
    }
}

fun Ej32_10() {
    var bd_clientes = mutableMapOf<String, Map<String, Any>>()
    var salir = false

    do {
        mostrarMenu()
        var opcion = elegirOpcion()

        when (opcion) {
            "1" -> {
                var nif_cliente = preguntarNif()
                if (nif_cliente in bd_clientes) {
                    println("Este NIF ya se encuentra registrado en la base de datos.")
                } else {
                    var datos_cliente = pedirDatosClientes()
                    bd_clientes[nif_cliente] = datos_cliente
                    println("Cliente añadido correctamente.")
                }
            }

            "2" -> eliminarDatos(bd_clientes)

            "3" -> mostrarDatos(bd_clientes)

            "4" -> listarClientes(bd_clientes)

            "5" -> listarPreferentes(bd_clientes)

            "6" -> {
                salir = true
                println("Bye, bye...")
            }

            else -> {
                println("Opción no válida. Inténtalo de nuevo.")
            }
        }
    } while (!salir)
}


