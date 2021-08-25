package FunctionsII.CaixaMercado

import java.util.*
import kotlin.collections.ArrayList

/*
A primeira função será cabecalhoDoComprovante(),
que não receberá parametros e apenas fará a impressão
do templateabaixo:
##########DH SuperMarket##########
 */

fun imprimeCabecalhoNotaFiscal(){
    println("##########DH SuperMarket##########")
}

fun retornaDataAtualDaCompra(): String{
    val data = Calendar.getInstance()
    return "${data.get(Calendar.DATE)}/${data.get(Calendar.MONTH)+1}/${data.get(Calendar.YEAR)}"
}

fun imprimeListaDeProdutos(lista: ArrayList<Produto>){
    for (produto in lista) {
        println("${produto.nome} R$${produto.preco}")
    }

}

fun adicionaRodape(lista: ArrayList<Produto>): Double{
    var valor = 0.0
    for (produto in lista){
        valor += produto.preco
    }
    return valor
}
