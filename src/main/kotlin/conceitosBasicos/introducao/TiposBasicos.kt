package conceitosBasicos.introducao

fun main() {
    // Tipos numéricos inteiros
    val num1: Byte = 22
    val num2: Short = 11
    val num3: Int = 17
    val num4: Long = 81

    println("Menor valor de um Byte: ${Byte.MIN_VALUE}")
    println("Maior valor de um Byte: ${Byte.MAX_VALUE}")
    println("Menor valor de um short: ${Short.MIN_VALUE}")
    println("Maior valor de um Short: ${Short.MAX_VALUE}")
    println("Menor valor de um Int: ${Int.MIN_VALUE}")
    println("Maior valor de um Int: ${Int.MAX_VALUE}")
    println("Menor valor de um Long: ${Long.MIN_VALUE}")
    println("Maior valor de um Long: ${Long.MAX_VALUE}")

    // Tipos numéricos reais
    val num5: Float = 1.6F
    val num6: Double = 1.6

    println("Menor valor de um Float: ${Float.MIN_VALUE}")
    println("Maior valor de um Float: ${Float.MAX_VALUE}")
    println("Menor valor de um Double: ${Double.MIN_VALUE}")
    println("Maior valor de um Double: ${Double.MAX_VALUE}")

    // Tipo caractere
    val char: Char = 'k'

    // Tipo String
    val string: String = "Kotlin"

    // Tipo booleano
    val boolean: Boolean = true // or false

    println(listOf(num1, num2, num3, num4, num5, num6, char, string, boolean))

    println("O número 17 é um Int? ${17 is Int}")
    println("O número 2147483648 é um Long? ${2147483648 is Long}")
    println("O número 1.6 é um Double? ${1.6 is Double}")

    // Tudo no Kotlin é objeto
    println(16.inc())

}