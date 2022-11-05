package conceitosBasicos.estruturasDeControle

fun main() {
    var numero: Int = 0

    while (numero != -1) {
        println("Digite um número:")
        var input = readLine() ?: "0"
        numero = input.toIntOrNull() ?: 0

        println("Você escolheu o número $numero")
    }

}