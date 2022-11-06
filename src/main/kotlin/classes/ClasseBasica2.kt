package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) {
    val nome: String = nomeInicial
}

fun main() {
    val pessoa1 = Pessoa1(nome = "João")
    pessoa1.nome = "José"
    println("${pessoa1.nome} sabe programar")

    val pessoa2 = Pessoa2("Maria")
    val pessoa3 = Pessoa3(nomeInicial = "Pedro")
    println("${pessoa2.nome} e ${pessoa3.nome} são programadores")
}