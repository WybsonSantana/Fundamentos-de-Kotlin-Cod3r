package conceitosBasicos.operadores

data class Carro(
    val marca: String,
    val modelo: String
)

fun main() {
    val (marca, modelo) = Carro("Ford", "Mustang")
    println("$marca $modelo")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em 3º lugar")
}