package funcoes

fun <E> List<E>.secondOrNull(): E? {
    return if (this.size >= 2) this[1] else null
}

fun main() {
    val nomes = listOf("João", "Maria", "Pedro")
    println(nomes.secondOrNull())

    val numeros = listOf(1)
    println(numeros.secondOrNull())
}