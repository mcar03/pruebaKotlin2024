/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

 fun f1(a: Double, b: Double, c: Double, referenciaFuncion: (Double, Double, Double) -> String): String {
    return referenciaFuncion(a, b, c)
}

fun numeroSoluciones(a: Double, b: Double, c: Double): String {
    val operacion = b * b - 4 * a * c
    return when {
        operacion > 0 -> "Tiene dos soluciones $operacion." 
        operacion == 0.0 -> "Tiene una solución $operacion." 
        else -> "No hay soluciones." 
    }
}

fun main() {
    val resultado = f1(1.3, -7.0, 2.0, ::numeroSoluciones)
    println(resultado) 
}