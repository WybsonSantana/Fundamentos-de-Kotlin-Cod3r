package conceitosBasicos.introducao

fun main() {
    var x: Int? = null
    println(x?.inc())

    println("Gerando a exceção:")
    println(x!!.inc())

}