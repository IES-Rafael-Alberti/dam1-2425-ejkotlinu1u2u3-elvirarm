package com.dam1.ejercicioskotlin.U2.Condicionales

//

//ToDo: arreglar que solo me pueda pedir un ingrediente

fun preguntarTipoPizza(msj: String): String{

    println(msj)
    var tipoPizza = readln().lowercase()

    if (tipoPizza != "vegetariana" && tipoPizza != "no vegetariana"){
        return preguntarTipoPizza("La respuesta tiene que ser 'vegetariana' o 'no vegetariana'. Inténtelo de nuevo")
    }else{
        return tipoPizza
    }
}

fun mostrarMenu(tipoPizza: String){
    when(tipoPizza){
        "vegetariana" -> println("Ingredientes vegetarianos: Pimiento y tofu.")
        "no vegetariana" -> println("Ingredientes no vegetarianos: Peperoni, jamón y salmón.")
    }
}

fun elegirIngredientes(msj: String, tipoPizza: String){
    println(msj)
    var ingrediente = readln().lowercase()

    when (tipoPizza) {
        "vegetariana" -> {
            if (ingrediente == "pimiento" || ingrediente == "tofu") {
                println("Tu pizza es vegetariana")
            } else {
                println("Ingrediente no válido para una pizza vegetariana.")
            }
        }
        "no vegetariana" -> {
            if (ingrediente == "peperoni" || ingrediente == "jamón" || ingrediente == "salmón") {
                println("Tu pizza es no vegetariana")
            } else {
                println("Ingrediente no válido para una pizza no vegetariana.")
            }
        }
    }
}


fun Ej21_10(){
    var tipoPizza = preguntarTipoPizza("¿Quieres una pizza vegetariana o no vegetariana?")
    mostrarMenu(tipoPizza)
    elegirIngredientes("Elige un ingrediente para tu pizza", tipoPizza)

}