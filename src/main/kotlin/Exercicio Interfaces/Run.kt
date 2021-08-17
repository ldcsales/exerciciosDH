package `Exercicio Interfaces`

import javax.print.Doc

fun main() {

    var contrato = Contrato("Imovel Campinas", "Contrato")
    var documento = Documento("Arquivo", "Texto")
    var foto = Foto("Img01","JPEG")

    var impressora = Impressora()
    impressora.adicionarImprimivel(contrato)
    impressora.adicionarImprimivel(documento)
    impressora.adicionarImprimivel(foto)

    impressora.imprimirLista()



}