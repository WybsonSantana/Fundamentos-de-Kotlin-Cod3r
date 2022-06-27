package conceitosBasicos.introducao

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.uppercase())
    } else if (x is Int) {
        println(x.plus(3))
    } else {
        println("Repense sua vida!")
    }
}

fun souEsperto2(x: Any) {
    when (x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida!")
    }
}

fun main() {
    souEsperto("Kotlin")
    souEsperto(11)
    souEsperto('X')

    souEsperto2("Java")
    souEsperto2(17)
    souEsperto2(true)
}