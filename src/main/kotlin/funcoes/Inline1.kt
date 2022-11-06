package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação...")
    }
}

fun main() {
    transacao {
        println("Executando SQL 01...")
        println("Executando SQL 02...")
        println("Executando SQL 03...")
    }
}