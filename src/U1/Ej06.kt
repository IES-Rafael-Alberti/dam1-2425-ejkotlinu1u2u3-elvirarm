import java.lang.IllegalArgumentException

///Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).

fun pedirPrecioFinal (msj:String, min:Int): Float{
    var precioFinal:Float? = null
    do{
        println(msj)

        try{
            precioFinal = readln().toFloat()

            if (precioFinal != null && precioFinal < min){
                throw IllegalArgumentException ("El número debe ser mayor que $min")
            }
        } catch(e:IllegalArgumentException){
            println(e)
            precioFinal = null
        }
        catch (e: NumberFormatException){
            println("**ERROR** Introduce un número valido.")
            precioFinal = null
        }
    } while (precioFinal == null)
    return precioFinal
}

fun calcularIVA (precioFinal: Float): Float{
    val ivaPagado =  precioFinal * (10f / 100)
    return ivaPagado
}

fun mostrarIVA (msj:String, ivaPagado: Float){
    println("$msj" + "$ivaPagado")
}

fun calcularPrecioSinIVA (precioFinal: Float, ivaPagado: Float): Float{
    val precioSinIVA = precioFinal - ivaPagado
    return precioSinIVA
}

fun mostrarPrecioSinIVA (msj:String, precioSinIVA:Float){
    println("$msj" + "$precioSinIVA")
}

fun main(){
    var precioFinal = pedirPrecioFinal( msj = "Introduce el importe total del artículo: ", min = 0)
    val ivaPagado = calcularIVA(precioFinal)
    mostrarIVA( msj = "Este es el IVA total pagado: ", ivaPagado)
    val precioSinIVA = calcularPrecioSinIVA(precioFinal, ivaPagado)
    mostrarPrecioSinIVA("Este es el precio del artículo sin IVA: ", precioSinIVA)
}