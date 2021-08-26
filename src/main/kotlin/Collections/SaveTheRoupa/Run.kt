package Collections.SaveTheRoupa

fun main() {

    var peca1 = Peca("Armani", "Oculos")
    var peca2 = Peca("Oakley", "Camiseta")
    var peca3 = Peca("Tommy", "Calca")
    var peca4 = Peca("Gucci", "Bolsa")
    var peca5 = Peca("Vivara", "Anel")
    var peca6 = Peca("Tifanny", "Colar")
    var peca7 = Peca("Brooksfield", "Bermuda")

    var guarda1 = GuardaVolumes()
    var lista1 = mutableListOf<Peca>(peca1, peca2)
    guarda1.guardarPecas(lista1)
    guarda1.mostrarPecas()
    //guarda1.devolverPecas(1)
    //guarda1.mostrarPecas()

    lista1.clear()
    lista1 = mutableListOf(peca3,peca4,peca5)
    guarda1.guardarPecas(lista1)
    guarda1.mostrarPecas()
    guarda1.devolverPecas(2)



}