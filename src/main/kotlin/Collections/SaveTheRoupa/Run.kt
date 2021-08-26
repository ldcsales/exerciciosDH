package Collections.SaveTheRoupa

fun main() {

    var peca1 = Peca("Armani", "Oculos")
    var peca2 = Peca("Oakley", "Camiseta")
    var peca3 = Peca("Tommy", "Calca")
    var peca4 = Peca("Gucci", "Bolsa")
    var peca5 = Peca("Vivara", "Anel")
    var peca6 = Peca("Tifanny", "Colar")
    var peca7 = Peca("Brooksfield", "Bermuda")

    var guarda = GuardaVolumes()

    var lista = mutableListOf<Peca>(peca1, peca2)

    println(guarda.guardarPecas(lista))
    guarda.mostrarPecas()

    lista = mutableListOf(peca3, peca4, peca5)
    println(guarda.guardarPecas(lista))
    guarda.mostrarPecas()
    guarda.devolverPecas(1)
    guarda.mostrarPecas()


}