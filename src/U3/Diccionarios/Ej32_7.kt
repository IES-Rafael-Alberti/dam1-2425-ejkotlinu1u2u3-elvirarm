package U3.Diccionarios

// Escribir un programa que cree un diccionario simulando una cesta de la compra. El programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida terminar. Después se debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato


fun pedirDatos(listaCompra:MutableMap<String,Float>){
    var salir = false

    do{
        println("Introduce un artículo que quieras comprar: ")
        var articulo = readln()

        println("Introduce el precio del artículo: ")
        var precio = readln().toFloat()

        listaCompra[articulo] = precio

        println("Si quieres salir escribe 'salir', sino pulsa otra tecla")
        var quieresSalir = readln().lowercase().trim()

        if (quieresSalir == "salir") {
            salir = true
        }

    }
        while (!salir)
}

fun mostrarTabla(listaCompra: MutableMap<String,Float>){

    println("Lista de la compra")
        println("Artículo" + " ".repeat(18) + "Precio")

        val maxArticuloLong = listaCompra.keys.maxOf { it.length }
        val maxPrecioLong = listaCompra.values.maxOf { String.format("%.2f", it).length }

        println("-".repeat(maxArticuloLong + maxPrecioLong + 2))

        var total = 0.0
        for ((articulo, precio) in listaCompra) {
            println("${articulo.padEnd(maxArticuloLong)} ${String.format("%.2f", precio).padStart(maxPrecioLong)}")
            total += precio
        }

        println("-".repeat(maxArticuloLong + maxPrecioLong + 2))

        println("\nEl coste total es: ${String.format("%.2f", total)}")
    }


fun main(){
    var listaCompra = mutableMapOf<String, Float>()
    pedirDatos(listaCompra)
    mostrarTabla(listaCompra)
 }