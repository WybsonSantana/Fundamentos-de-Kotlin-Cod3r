package conceitosBasicos.introducao.operadores

fun obterResultado(nota: Double): String =
    if (nota >= 7) "Aprovado!" else "Reprovado!"

fun main() {
    println(obterResultado(8.3))
    println(obterResultado(5.9))
}