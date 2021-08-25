package FunctionsII.CaixaMercado

class CarrinhoDeCompras() {
    var lista = ArrayList<Produto>()

    fun adicionarItens(produto: Produto) {
        this.lista.add(produto)
    }

}