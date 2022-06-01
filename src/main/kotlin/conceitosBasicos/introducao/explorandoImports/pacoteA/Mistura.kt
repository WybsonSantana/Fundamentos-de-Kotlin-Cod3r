package conceitosBasicos.introducao.explorandoImports.pacoteA

fun simplesFuncao(mensagem: String): String {
    return "Mensagem: $mensagem"
}

class Objeto(val nome: String)

enum class FaceMoeda {
    CARA,
    COROA
}