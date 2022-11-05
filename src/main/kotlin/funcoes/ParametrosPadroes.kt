package funcoes

import kotlin.math.pow

fun potencia(base: Int = 2, expoente: Int = 1): Int {
    return base.toDouble().pow(expoente.toDouble()).toInt()
}

fun main() {
    println(potencia(2, 3))
    println(potencia(10))
    println(potencia(base = 10))
    println(potencia(expoente = 8))
}