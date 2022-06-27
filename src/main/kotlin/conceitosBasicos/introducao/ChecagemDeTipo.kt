package conceitosBasicos.introducao

fun main() {
    val valor = "Kotlin"

    if (valor.javaClass.kotlin.qualifiedName == "kotlin.String") {
        println(valor)
    } else {
        println("Não é uma String")
    }
}