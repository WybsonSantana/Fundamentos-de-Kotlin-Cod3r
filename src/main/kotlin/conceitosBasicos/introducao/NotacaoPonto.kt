package conceitosBasicos.introducao

fun main() {
    val x: Int = 16.inc()
    val y: String = x.toString()

    println("A variável 'x' é um Int: $x")
    println("O primeiro char da String 'y' é: ${y.first()}")
    println("O último char da String 'y' é: ${y.last()}")

}