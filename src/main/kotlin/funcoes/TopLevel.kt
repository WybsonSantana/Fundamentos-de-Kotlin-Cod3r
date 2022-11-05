package funcoes

fun min(a: Int, b: Int) = if (a < b) a else b

fun main() {
    println("O menor número é ${min(3, 4)}")
}