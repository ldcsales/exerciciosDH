package `Aula-09-08`.`3`

class Estoque(
    var nome: String,
    var qtdAtual: Int,
    var qtdMinima: Int
) {

    init {
        if (qtdAtual < 0) {
            qtdAtual = 0
        }
        if (qtdMinima < 0) {
            qtdMinima = 0
        }

    }

    val red = "\u001b[31m"
    val yellow ="\u001b[33m"
    val reset = "\u001b[0m"


    fun mudarNome(nome: String) {
        this.nome = nome
        println(red + "Nome Alterado para ${this.nome}\n" + reset)
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        this.qtdMinima = qtdMinima
        println("Quntidade minima alterada para ${this.qtdMinima}\n")
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
        println("Foi reposto $qtd itens\nEstoque Atual = $qtdAtual\n")
    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd
        println("Foi dado baixa em $qtd itens\nEstoque atual = $qtdAtual\n")
    }

    fun mostra(): Unit {
        println("Nome: $nome\nQtd Minima: $qtdMinima\nQtd Atual: $qtdAtual\n")
        //return ""
    }

    fun precisaRepor(): Boolean {
        if (qtdAtual < qtdMinima) {
            return true
        } else {
            return false
        }
    }

}