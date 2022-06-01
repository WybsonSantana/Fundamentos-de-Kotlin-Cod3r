package conceitosBasicos.introducao.explorandoImports

import conceitosBasicos.introducao.explorandoImports.pacoteA.simplesFuncao as funcaoSimples
import conceitosBasicos.introducao.explorandoImports.pacoteA.Objeto

import conceitosBasicos.introducao.explorandoImports.pacoteA.FaceMoeda.CARA
import conceitosBasicos.introducao.explorandoImports.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("Kotlin 1.6"))
    val objeto = Objeto("Bola")
    println(objeto.nome)

    println(CARA)

    println(somar(10, 7))
    println(subtrair(10, 7))

}