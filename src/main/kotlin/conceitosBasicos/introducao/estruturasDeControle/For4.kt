package conceitosBasicos.introducao.estruturasDeControle

fun main() {
    val alunos = arrayListOf("Andréia", "Carla", "Marcele")

    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1}: $aluno")
    }
}