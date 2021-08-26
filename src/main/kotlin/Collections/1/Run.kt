package Collections.`1`

fun main() {
    var dicionario = Dicionario()

    dicionario.dicionario = mapOf(0 to "Ovos", 1 to "Agua", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    //dicionario = mapOf(0 to "Ovos")

    dicionario.printarLista(dicionario.dicionario)

}