package funcoes

class Produto(
    val nome: String,
    val preco: Double
)

infix  fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main() {
    val produto1 = Produto("Notebook", 4999.99)
    val produto2 = Produto(preco = 3.49, nome = "Borracha")

    println(produto1 maisCaroQue  produto2)
    println(produto2.maisCaroQue(produto1))
}