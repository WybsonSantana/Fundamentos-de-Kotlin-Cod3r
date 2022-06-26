package conceitosBasicos.introducao.operadores

fun main() {
    val (v1, v2, v3, v4) = listOf(3, 5, 1, 15)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v1
    val divisao = v4 / v1
    val multiplicacao = v1 * v2
    val modulo = v1 % v2

    println("Soma: $soma\nSubtração: $subtracao\nDivisão: $divisao\nMultiplicação: $multiplicacao\nMódulo: $modulo")
}