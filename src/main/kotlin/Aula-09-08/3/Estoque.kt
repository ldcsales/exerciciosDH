package `Aula-09-08`.`3`

class Estoque(
    var nome: String,
    var qtdAtual: Int,
    var qtdMinima: Int
) {

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd
    }

    fun mostra(): Unit {
        println("Nome: $nome\nQtd Minima: $qtdMinima\nQtd Atual: $qtdAtual")
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