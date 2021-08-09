package CarrinhoCompras

open class Produto(var preco : Double = 0.0, var nome: String) {

    /*
    public get(){
        return preco

    }
*/
    open fun getPrecoProduto() : Double{
        return preco
    }
    /*open fun getPreco() : Double{
        return preco
    }*/

}