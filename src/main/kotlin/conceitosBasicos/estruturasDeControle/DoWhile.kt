package conceitosBasicos.estruturasDeControle

fun main() {
    var opcao: Int = -1

    do {
        val input = readLine() ?: "0"
        opcao = input.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao")
    } while (opcao != -1)
}