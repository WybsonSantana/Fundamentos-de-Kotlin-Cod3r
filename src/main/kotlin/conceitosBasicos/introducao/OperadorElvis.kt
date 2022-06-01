package conceitosBasicos.introducao

fun main() {
    val opcional1: String? = null
    val obrigatorio1: String = opcional1 ?: "Valor padrão caso a variável opcional seja nula"

    val opcional2: String? = "Valor opcional"
    val obrigatorio2: String = opcional2 ?: "Valor padrão caso a variável opcional seja nula"

    println(opcional1)
    println(obrigatorio1)
    println(opcional2)
    println(obrigatorio2)

}