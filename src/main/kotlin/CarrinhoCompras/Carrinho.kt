package CarrinhoCompras

class Carrinho() {


var produtos = mutableListOf<Produto>()


    //var produtos: ArrayList<Produto>
    /*var produtos
        get() = listOf<Produto>()
        set(value) = TODO()
*/
    var valorFinal : Double = 0.0



    //var lista = produtos[]
    //private var contador = 0
    fun adicionar(produto: Produto){
        produtos.add(produto)
    }

    fun getValorTotal() : Double{
        var cont : Int = 0
        for (cont in produtos.indices){
            valorFinal += produtos[cont].preco
        }
        return valorFinal
    }

}







