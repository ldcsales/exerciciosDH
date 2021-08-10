package `Aula-09-08`.`2`

fun main() {
    var item1 = Item(1, "Calca", 5, 10.0)
    var item2 = Item(2, "Camiseta", 1, 5.0)
    var item3 = Item(3, "Sapato", 10, 20.0)

    var fatura = Fatura()
    fatura.adicionarItem(item1)
    fatura.adicionarItem(item2)
    fatura.adicionarItem(item3)

    println(fatura.totalDaFatura())
    fatura.imprimirFatura()
    //println(fatura.listaFatura)
}