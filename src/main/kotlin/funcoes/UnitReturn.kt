package funcoes

import kotlin.math.max

fun imprimirMaior1(x: Int, y: Int) {
    println(max(x, y))
}

fun imprimirMaior2(x: Int, y: Int): Unit {
    println(max(x, y))
}

fun imprimirMaior3(x: Int, y: Int): Unit {
    println(max(x, y))
    return
}

fun imprimirMaior4(x: Int, y: Int): Unit {
    println(max(x, y))
    return Unit
}

fun imprimirMaior5(x: Int, y: Int) {
    println(max(x, y))
    return Unit
}

fun main() {
    imprimirMaior1(2, 1)
    imprimirMaior2(2, 1)
    imprimirMaior3(2, 1)
    imprimirMaior4(2, 1)
    imprimirMaior5(2, 1)
}