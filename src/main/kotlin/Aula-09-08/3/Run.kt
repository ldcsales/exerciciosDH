package `Aula-09-08`.`3`

fun main() {
    var estoque = Estoque("Caneca", 10, 5)

    estoque.mudarNome("Caneta")
    estoque.mostra()
    estoque.mudarQtdMinima(4)
    estoque.mostra()
    estoque.darBaixa(5)
    estoque.mostra()
    println(estoque.precisaRepor())
    estoque.mostra()
    estoque.repor(5)
    estoque.mostra()
    estoque.darBaixa(10)
    estoque.mostra()
    println(estoque.precisaRepor())


}