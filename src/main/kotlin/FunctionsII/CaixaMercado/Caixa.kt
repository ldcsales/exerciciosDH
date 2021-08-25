package FunctionsII.CaixaMercado

class Caixa {

   inline fun fechamentoDeConta(
       imprimeCabecalhoNotaFiscal: () -> Unit,
       retornaDataAtualDaCompra: () -> String,
       imprimeListaDeProdutos: () -> Unit,
       adicionaRodape: () -> Double,

   ){
       imprimeCabecalhoNotaFiscal()
       retornaDataAtualDaCompra()
       imprimeListaDeProdutos()
       println("TOTAL = ${adicionaRodape()}")

    }
}