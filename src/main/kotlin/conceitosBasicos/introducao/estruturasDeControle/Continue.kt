package conceitosBasicos.introducao.estruturasDeControle

fun main() {
    for (i in 1..10) {
        if (i == 5)
            continue
        println("Número atual: $i")
    }
}