package conceitosBasicos.introducao.estruturasDeControle

fun main() {
    val nota = 8.9

    // Utilizando o operador range
    if (nota in 9.0..10.0) {
        println("Fantástico!")
    } else if (nota in 7.0..8.9) {
        println("Parabéns!")
    } else if (nota in 4.0..6.9) {
        println("Tem como recuperar!")
    } else if (nota in 0.0..3.9) {
        println("Te vejo no próximo semestre!")
    } else {
        println("Nota inválida!")
    }

}