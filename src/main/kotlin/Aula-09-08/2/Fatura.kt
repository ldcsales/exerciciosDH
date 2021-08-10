package `Aula-09-08`.`2`

class Fatura() {

    var listaFatura = mutableListOf<Item>()


    fun adicionarItem(item: Item) {

        listaFatura.add(item)
    }

    fun totalDaFatura(): Double {
        var total = 0.0
        var cont = 0
        for (cont in listaFatura.indices) {
            total += ((listaFatura[cont].preco) * (listaFatura[cont].quantidade))
        }
        return total
    }

    fun imprimirFatura() {
        var cont = 0
        for (cont in listaFatura.indices) {
            println("${listaFatura[cont].numero} ${listaFatura[cont].descricao} ${listaFatura[cont].quantidade} ${listaFatura[cont].preco}")
        }
    }
}