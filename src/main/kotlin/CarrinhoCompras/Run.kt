package CarrinhoCompras

fun main() {
    var carrinho = Carrinho()
    var comboSimples1 = ComboSimples(15.0,20.0,"Combo1")
    var comboSimples2 = ComboSimples(20.0,25.0,"Combo2")
    var comboSimples3 = ComboSimples(25.0,30.0,"Combo3")
    var comboFamilia1 = ComboFamiliar(50.0,"Familia1")

    comboFamilia1.adicionarCombo(comboSimples1)
    comboFamilia1.adicionarCombo(comboSimples2)
    println(comboFamilia1.getPrecoProduto())
    println(comboSimples3.getPrecoProduto())
    carrinho.adicionar(comboFamilia1)
    carrinho.adicionar(comboSimples3)
    println(carrinho.getValorTotal())
}