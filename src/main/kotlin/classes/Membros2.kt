package classes

class Calculadora {
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun subtrair(valor: Int): Calculadora {
        resultado -= valor
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun dividir(valor: Int): Calculadora {
        resultado /= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun exibir(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(1, 2, 3).multiplicar(2).exibir()
    calculadora.somar(8, 10).exibir().dividir(2).exibir()
    calculadora.subtrair(5).exibir().limpar()
    println(calculadora.obterResultado())

}