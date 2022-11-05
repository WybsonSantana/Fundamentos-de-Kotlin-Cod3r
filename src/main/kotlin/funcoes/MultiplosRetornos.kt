package funcoes

import java.util.Calendar

data class Horario(
    val hora: Int,
    val minuto: Int,
    val segundo: Int
)

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main() {
    val (hh, mm, ss) = agora()
    println("$hh:$mm:$ss")
}