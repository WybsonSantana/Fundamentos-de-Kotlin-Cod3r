package conceitosBasicos.operadores

fun main() {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = false

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2 // Ou
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2 // E
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2 // Ou exclusivo

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)
}