package classes

class Data(
    var dia: Int,
    var mes: Int,
    var ano: Int
) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var dataNascimento: Data = Data(dia = 11, mes = 3, ano = 1990)

    println("${dataNascimento.dia}/${dataNascimento.mes}/${dataNascimento.ano}")
    with(dataNascimento) {
        println("$dia/$mes/$ano")
    }

    dataNascimento.mes = 12
    println(dataNascimento.formatar())
}