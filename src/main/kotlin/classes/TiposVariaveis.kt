package classes

const val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano"
    println("$diretamenteNoArquivo, $local!")
}

class Objeto {
    private var variavelDeInstancia = "Boa noite"

    companion object {
        @JvmStatic
        val constanteDeClasse = "Beltrano"
    }

    fun imprimir() {
        val local = 17

        if (local > 3) {
            val variavelDeBloco = "Ciclano"
            println("$variavelDeInstancia - $constanteDeClasse - $local - $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Objeto().imprimir()
    println(Objeto.constanteDeClasse)
}