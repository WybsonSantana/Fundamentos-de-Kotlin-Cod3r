package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Iniciando o método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Finalizando o método $nomeFuncao...")
    }
}

fun somarDoisNumeros(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    val resultado = executarComLog("Somar") {
        somarDoisNumeros(8, 9)
    }

    println(resultado)
}