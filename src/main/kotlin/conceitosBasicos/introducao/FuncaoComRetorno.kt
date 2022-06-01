package conceitosBasicos.introducao

fun multiplicar(x: Int, y: Int = 1): Int {
    return x * y
}

fun main() {
    println(multiplicar(10, 5))
    println(multiplicar(10))

}