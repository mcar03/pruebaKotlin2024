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
 fun f2(array: DoubleArray, sumaLambda: (Double) -> Double): Double {
     var suma = 0
     return {
         for(i in array.indices)
         	suma+= myArray[i]
     }
 }

fun main() {
    val resultado = f1(1.3, -7.0, 2.0, ::numeroSoluciones)
    println(resultado) 
    
val multiplicar: (Double, Double, Double) -> Double = { x, y, z -> 
        if (x == 0.0 && y == 0.0 && z == 0.0) 1.0 else x * y * z 
    }

    
    val resultadoMultiplicacion = multiplicar(1.0, 2.0, 3.0)

   
    println("Resultado de soluciones: $resultado")
    println("Resultado de multiplicación: $resultadoMultiplicacion")

    var array = [1.0,2.5,3.4,4.0,5.0,6.9,7.7,8.1,9.0,10.3]
    
    val resultadoSumaArray = f2()
}
