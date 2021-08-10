package `Aula-09-08`.`2`

class Item(
    var numero: Int = 1,
    var descricao: String = "",
    var quantidade: Int = 0,
    var preco: Double = 0.0
) {
    init {
        if (quantidade < 0) {
            quantidade = 0
        }
        if (preco < 0.0) {
            preco = 0.0
        }

    }
}
