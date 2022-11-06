package funcoes

class Operacoes {
    fun somar(x: Int, y: Int): Int {
        return x + y
    }
}

fun somar(x: Int, y: Int): Int {
    return x + y
}

fun calc(x: Int, y: Int, funcao: (Int, Int) -> Int): Int {
return funcao(x, y)
}

fun main() {
    println(calc(3, 2, Operacoes()::somar))
    println(calc(3, 2, ::somar))
}