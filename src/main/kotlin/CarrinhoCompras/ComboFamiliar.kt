package CarrinhoCompras

class ComboFamiliar(preco : Double, nome: String): Produto(preco,nome) {

    var combos = mutableListOf<ComboSimples>()

    fun adicionarCombo(combo : ComboSimples){

        combos.add(combo)

    }

    override fun getPrecoProduto() : Double {
        var cont = 0
        preco = 0.0
        for (cont in combos.indices) {
            preco += combos[cont].precoPromocional
        }
        return preco
    }
}