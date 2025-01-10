package com.dam1.ejercicioskotlin.U3.Diccionarios

// El directorio de los clientes de una empresa está organizado en una cadena de texto como la de más abajo, donde cada línea contiene la información del nombre, email, teléfono, nif, y el descuento que se le aplica. Las líneas se separan con el carácter de cambio de línea \n y la primera línea contiene los nombres de los campos con la información contenida en el directorio.

fun procesarDirectorio(directorio: String): Map<String, Map<String, Any>> {
    val lineas = directorio.split("\n")

    val cabecera = lineas[0]

    val clientes = lineas.drop(1).associate { linea ->
        val campos = linea.split(";")

        val nif = campos[0]
        val clienteInfo = mapOf(
            "nombre" to campos[1],
            "email" to campos[2],
            "teléfono" to campos[3],
            "descuento" to campos[4].toFloat()
        )

        nif to clienteInfo
    }

    return clientes
}

fun Ej32_11() {

    val directorio = """
        nif;nombre;email;teléfono;descuento
        01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5
        71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
        63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
        98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7
    """.trimIndent()

    val clientes = procesarDirectorio(directorio)

    println(clientes)
}
