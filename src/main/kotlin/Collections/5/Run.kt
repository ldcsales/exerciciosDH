package Collections.`5`

fun main() {

    fun somaTotal(set: Set<Int>) {
        var valor = 0
        for (cont in set) {
            println(cont)
            valor += cont
        }
        println(valor)
    }

    var set = setOf<Int>(1, 5, 6, 7, 8, 9, 10, 9)
    // deixa adc numero igual mas nao insere

    somaTotal(set)

}