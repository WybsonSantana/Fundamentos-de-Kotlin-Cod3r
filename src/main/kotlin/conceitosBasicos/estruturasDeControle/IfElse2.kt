package conceitosBasicos.estruturasDeControle

fun main() {
    val num1 = 17
    val num2 = 11

    val maiorValor = if (num1 > num2) {
        println("Processando a estrutura do If...")
        num1
    } else {
        println("Processando a estrutura do Else...")
        num2
    }

    println("O maior valor entre $num1 e $num2 é $maiorValor")

}