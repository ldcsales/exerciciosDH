package FunctionsII.CaixaMercado

fun main() {

    var produto1 = Produto("Leite", 10.0)
    var produto2 = Produto("Arroz", 20.0)
    var produto3 = Produto("Feijao", 12.0)
    var produto4 = Produto("Cerveja", 5.0)

    val carrinhoDeCompras = CarrinhoDeCompras()

    carrinhoDeCompras.adicionarItens(produto1)
    carrinhoDeCompras.adicionarItens(produto2)
    carrinhoDeCompras.adicionarItens(produto3)
    carrinhoDeCompras.adicionarItens(produto4)

    val caixa = Caixa()
    /*
    caixa.fechamentoDeConta(cabecalho = {imprimeCabecalhoNotaFiscal()},
        dataCompra = {retornaDataAtualDaCompra()} ,
        //listaDeProdutos = carrinhoDeCompras.lista
        imprimeListaDeCompras = {imprimeListaDeProdutos(carrinhoDeCompras.lista)} ,
        adicionaRodape = {adicionaRodape(carrinhoDeCompras.lista)}
    )
    */

    caixa.fechamentoDeConta(
        { imprimeCabecalhoNotaFiscal() },
        { retornaDataAtualDaCompra() },
        { imprimeListaDeProdutos(carrinhoDeCompras.lista) },
        { adicionaRodape(carrinhoDeCompras.lista) }
    )

}