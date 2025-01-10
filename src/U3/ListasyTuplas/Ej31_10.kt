package U3.ListasyTuplas

// Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.

fun listaPrecios():List<Int>{
    return listOf(50,75,46,22,80,65,8)
}

fun mostrarPrecios(listaPrecios: List<Int>){
    println("El precio mayor es ${listaPrecios.max()} y el precio menor es ${listaPrecios.min()}.")
}
fun main(){
    var listaPrecios = listaPrecios()
    mostrarPrecios(listaPrecios)
}