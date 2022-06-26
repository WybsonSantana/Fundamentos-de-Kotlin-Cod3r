package conceitosBasicos.introducao

fun main() {
    val a: Int = 1

    // Número para String
    println(a.toString() + 1)

    // String para número
    println("1.9".toDouble() + 3)
    println("1".toInt() + 3)

    println("Kotlin".toIntOrNull())
    println("Kotlin".toIntOrNull() ?: 0)
}