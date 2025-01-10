package U3.Conjuntos

//Dadas las siguientes listas:

//frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
//frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]

//Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y set_frutas2.
//Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto llamado frutas_comunes.
//Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un conjunto llamado frutas_solo_en_frutas1.
//Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un conjunto llamado frutas_solo_en_frutas2.

fun encontrarComunes(setFrutas1: Set<String>, setFrutas2: Set<String>) {

    val frutasComunes = setFrutas1.intersect(setFrutas2)
    println("Las frutas que están en ambas listas son: $frutasComunes")
}

fun frutasSoloEnFrutas1(setFrutas1: Set<String>, setFrutas2: Set<String>) {

    val frutas1 = setFrutas1.subtract(setFrutas2)
    println("Las frutas que están en frutas1 pero no en frutas2 son: $frutas1")
}

fun frutasSoloEnFrutas2(setFrutas1: Set<String>, setFrutas2: Set<String>) {

    val frutas2 = setFrutas2.subtract(setFrutas1)
    println("Las frutas que están en frutas2 pero no en frutas1 son: $frutas2")
}

fun main() {

    val setFrutas1 = setOf("manzana", "pera", "naranja", "plátano", "uva")
    val setFrutas2 = setOf("manzana", "pera", "durazno", "sandía", "uva")

    encontrarComunes(setFrutas1, setFrutas2)
    frutasSoloEnFrutas1(setFrutas1, setFrutas2)
    frutasSoloEnFrutas2(setFrutas1, setFrutas2)
}
