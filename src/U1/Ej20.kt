package U1

///Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.

fun pedirTelefono():String{
    println("Introduce tu teléfono con el siguiente formato: +34-913724710-56")
    val telefono:String = readln()
    return telefono
}

fun comprobarFormato(telefono:String):List<String>{
    val partesTelefono:List<String> = telefono.split("-")

    if (partesTelefono[0] != "+34"){
        println ("El prefijo debe ser +34")
    }
    if (partesTelefono[1].length != 9) {
        println ("El teléfono debe tener 9 dígitos")
    }

    if (!partesTelefono[1].all { it.isDigit()}){
        println ("El teléfono debe ser numérico")
    }

    if (partesTelefono[2].length > 3){
        println("El sufijo debe tener 2 dígitos")
    }
    return partesTelefono
}

fun mostrarTelefono(partesTelefono:List<String>){
    println(partesTelefono[1])
}

fun main(){
    val telefono = pedirTelefono()
    val partesTelefono = comprobarFormato(telefono)
    mostrarTelefono(partesTelefono)


}