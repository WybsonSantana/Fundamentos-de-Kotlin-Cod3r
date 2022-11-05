package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(38, 3, 456, 8, 51, 1, 88, 73, a = 0)) {
        println(n)
    }
}