package CarrinhoCompras

class ComboSimples(var precoPromocional: Double, preco : Double, nome: String): Produto(preco,nome) {
    init {
        getPrecoProduto()
    }

    override fun getPrecoProduto(): Double{
        preco = precoPromocional
        return preco
    }

}