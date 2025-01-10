package U2.Iterativas

// Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo componen. La condición de corte es que se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados por el usuario fueron números pares.

fun pedirNumEntero(msj: String): Int {
    var salir: Boolean = false

    do {
        println(msj)
        var num = readln().toInt()

        when {
            (num > 0) -> return num
            (num == -1) -> return -1
            else -> println("El número introducido debe ser positivo o -1 para salir.")
        }

    } while (salir == false)
    return -1
}

fun sumarNumeros(num: Int){
    var suma = 0
    for (digito in num.toString()){
        suma += digito.toString().toInt()
    }
    println(suma)

}

fun main(){
    var num = pedirNumEntero("Introduce números enteros positivos. Introduce -1 para salir.")
    while (num != -1){
        sumarNumeros(num)
        num = pedirNumEntero("Introduce otro número o -1 para salir")
    }
}