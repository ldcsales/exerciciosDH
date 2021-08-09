package CarrinhoCompras

class ComboSimples(var precoPromocional: Double, preco: Double, nome: String): Produto(preco, nome) {


    override fun getPreco(){
        preco = precoPromocional
    }
}